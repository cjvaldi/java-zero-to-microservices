package com.cjvaldi.springboot.datajpa.app.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.MessageSource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cjvaldi.springboot.datajpa.app.models.entity.Cliente;
import com.cjvaldi.springboot.datajpa.app.models.service.IClienteService;
import com.cjvaldi.springboot.datajpa.app.models.service.IUploadFileService;
import com.cjvaldi.springboot.datajpa.app.util.paginator.PageRender;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("cliente") // guarda y pasa todos datos del formulario, no es necesario parar el id en
								// hiden
public class ClienteController {

	private final IClienteService clienteService;
	private final IUploadFileService uploadFileService;
	private final MessageSource messageSource;
	
	protected final Log logger = LogFactory.getLog(this.getClass());

	public ClienteController(IClienteService clienteService, 
			IUploadFileService uploadFileService,
			MessageSource messageSource) {
	    this.clienteService = clienteService;
	    this.uploadFileService = uploadFileService;
	    this.messageSource = messageSource;
	}
	
	@Secured("ROLE_USER")
	@GetMapping(value="/uploads/{filename:.+}")
	public ResponseEntity<Resource> verFoto(@PathVariable String filename){
		
		Resource recurso = null;
		try {
			recurso = uploadFileService.load(filename);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+ recurso.getFilename()+"\"")
				.body(recurso);
	}
	
//	@Secured("ROLE_USER")
	@PreAuthorize("hasRole('ROLE_USER')")  //prePostEnabled = true ->SprintSecurityConfig
	@GetMapping(value="/ver/{id}")
	public String ver(@PathVariable(value="id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		
//		Cliente cliente = clienteService.findOne(id);
		Cliente cliente = clienteService.fetchByIdWithFacturas(id);
		if(cliente == null) {
			flash.addAttribute("error","El cliente no existe en la base de datos");
			return "redirect:/listar";
		}
		
		model.put("cliente", cliente);
		model.put("titulo","Detalle cliente: "+ cliente.getNombre());
		
		return "ver";
	}

	@GetMapping(value = {"/listar", "/"})
	public String listar(@RequestParam(name = "page", defaultValue = "0") int page, 
	                     Model model, 
	                     Authentication authentication,
	                     HttpServletRequest request,
	                     Locale locale) {

	    // 1. Inyección directa en el método del controlador
	    if (authentication != null) {
	        logger.info("Inyección directa -> Hola usuario: " + authentication.getName());
	    }

	    // 2. Forma estática mediante SecurityContextHolder
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	    if (auth != null && auth.isAuthenticated() && !auth.getName().equals("anonymousUser")) {
	        logger.info("Forma estática SecurityContextHolder -> Hola usuario: " + auth.getName());

	        // Comprobación con método propio hasRole
	        if (hasRole("ROLE_ADMIN")) {
	            logger.info("Método hasRole() -> Hola " + auth.getName() + ", tienes acceso.");
	        } else {
	            logger.info("Método hasRole() -> Hola " + auth.getName() + ", NO tienes acceso.");
	        }

	        // Forma usando SecurityContextHolderAwareRequestWrapper
	        SecurityContextHolderAwareRequestWrapper securityContext = 
	                new SecurityContextHolderAwareRequestWrapper(request, "");
	        if (securityContext.isUserInRole("ROLE_ADMIN")) {
	            logger.info("SecurityContextHolderAwareRequestWrapper -> Tienes acceso como ROLE_ADMIN");
	        }

	        // Forma nativa usando HttpServletRequest
	        if (request.isUserInRole("ADMIN")) {
	            logger.info("HttpServletRequest -> Tienes acceso como ADMIN");
	        }
	    } else {
	        logger.info("Petición pública -> Usuario anónimo accediendo al listado.");
	    }

	    // Paginación y modelo
	    Pageable pageRequest = PageRequest.of(page, 5);
	    Page<Cliente> clientes = clienteService.findAll(pageRequest);

	    PageRender<Cliente> pageRender = new PageRender<>("/listar", clientes);
	    model.addAttribute("titulo", messageSource.getMessage("text.cliente.listar.titulo",null,locale));
	    model.addAttribute("clientes", clientes);
	    model.addAttribute("page", pageRender);

	    return "listar";
	}

	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/form")
	public String crear(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario de Cliente");
		return "form";
	}

//	@Secured("ROLE_ADMIN")
	@PreAuthorize("hasRole('ROLE_USER')")
	@RequestMapping(value = "/form/{id}")
	public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		Cliente cliente = null;
		if (id > 0) {
			cliente = clienteService.findOne(id);
			if(cliente == null) {
				flash.addFlashAttribute("error", "El ID del cliente no existe en la DB!");
				return "redirect:/listar";
			}
		} else {
			flash.addFlashAttribute("error", "El ID del cliente no puede ser cero!");

			return "redirect:/listar";
		}
		model.put("cliente", cliente);
		model.put("titulo", "Editar cliente");
		return "form";
	}

	@Secured("ROLE_ADMIN")
	@PostMapping("/form")
	public String guardar(@Valid Cliente cliente, BindingResult result, Model model, @RequestParam("file") MultipartFile foto, RedirectAttributes flash, SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de cliente");
			return "form";
		}
		
		if(!foto.isEmpty()) {
			if(cliente.getId() != null && cliente.getId() > 0 
					&& cliente.getFoto() != null && cliente.getFoto().length() >0) {
				
				uploadFileService.delete(cliente.getFoto());
			}
			String uniqueFilename = null;
			try {
				uniqueFilename = uploadFileService.copy(foto);
			} catch (IOException e) {
				e.printStackTrace();
			}
			flash.addFlashAttribute("info","Has subido correctamentes '"+uniqueFilename+"'");
			
			cliente.setFoto(uniqueFilename);
		}
		
		String mensajeFlash = (cliente.getId() != null)? "Cliente editado con éxito!":"Cliente creado con éxito!";
		
		clienteService.save(cliente);
		status.setComplete(); // cierra la sessio y ya elimina el id guardado
		flash.addFlashAttribute("success",mensajeFlash);
		return "redirect:listar";
	}

	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash) {
		if (id > 0) {
			Cliente cliente = clienteService.findOne(id);
			
			clienteService.delete(id);
			flash.addFlashAttribute("success", "Cliente eliminado con éxito!");
			
			if(uploadFileService.delete(cliente.getFoto())) {
				flash.addFlashAttribute("info"," Foto "+cliente.getFoto()+" eliminada con éxito!!");
			}
		}
		return "redirect:/listar";
	}
	
	private boolean hasRole(String role) {
	    SecurityContext context = SecurityContextHolder.getContext();
	    if (context == null || context.getAuthentication() == null) {
	        return false;
	    }

	    Authentication auth = context.getAuthentication();
	    Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();

	    if (authorities == null) {
	        return false;
	    }

	    return authorities.stream()
	            .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals(role));
		
//		for(GrantedAuthority authority: authorities) {
//			if(role.equals(authority.getAuthority())){
//				logger.info("Hola usuario ".concat(auth.getName()).concat(" tu role es ".concat(authority.getAuthority())));
//				return true;
//			}
//		}
//		return false;
	}

}
