package com.cjvaldi.springboot.form.app.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.cjvaldi.springboot.form.app.domain.Pais;
import com.cjvaldi.springboot.form.app.domain.Role;
import com.cjvaldi.springboot.form.app.domain.Usuario;
import com.cjvaldi.springboot.form.app.editor.NombreMayusculaEditor;
import com.cjvaldi.springboot.form.app.editor.PaisPropertyEditor;
import com.cjvaldi.springboot.form.app.editor.RolesEditor;
import com.cjvaldi.springboot.form.app.services.PaisService;
import com.cjvaldi.springboot.form.app.services.RoleService;
import com.cjvaldi.springboot.form.app.validation.UsuarioValidador;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("usuario")
public class FormController {

	@Autowired
	private UsuarioValidador validador;

	@Autowired
	private PaisService paisService;

	@Autowired
	private PaisPropertyEditor paisEditor;

	@Autowired
	private RoleService roleService;

	@Autowired
	private RolesEditor roleEditor;

	// filtros
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(validador);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "fechaNacimiento", new CustomDateEditor(dateFormat, true));

		binder.registerCustomEditor(String.class, "nombre", new NombreMayusculaEditor()); // para uno solo
		binder.registerCustomEditor(String.class, "apellido", new NombreMayusculaEditor()); // para uno solo

		binder.registerCustomEditor(Pais.class, "pais", paisEditor);
		binder.registerCustomEditor(Role.class, "roles", roleEditor);
	}

	@ModelAttribute("genero")
	public List<String> genero() {
		return Arrays.asList("Hombre", "Mujer");
	}

	@ModelAttribute("listaRoles")
	public List<Role> listaRoles() {
		return this.roleService.listar();
	}

	@ModelAttribute("listaPaises")
	public List<Pais> listaPaises() {
		return paisService.listar();
	}

	@ModelAttribute("listaRolesString")
	public List<String> listaRolesString() {
		List<String> roles = new ArrayList<>();
		roles.add("ROLE_ADMIN");
		roles.add("ROLE_USER");
		roles.add("ROLE_MODERADOR");
		return roles;
	}

	@ModelAttribute("listaRolesMap")
	public Map<String, String> listaRolesMap() {
		Map<String, String> paises = new HashMap<String, String>();
		paises.put("ROLE_ADMIN", "Administrador");
		paises.put("ROLE_USER", "Usuario");
		paises.put("ROLE_MODERADOR", "Moderador");
		return paises;
	}

	@ModelAttribute("paises")
	public List<String> paises() {
		return Arrays.asList("España", "Mexico", "Perú", "Chile", "Argentina", "Colombia", "Venezuela");
	}

	@ModelAttribute("paisesMap")
	public Map<String, String> paisesMap() {
		Map<String, String> paises = new HashMap<String, String>();
		paises.put("ES", "España");
		paises.put("MX", "Mexico");
		paises.put("PE", "Perú");
		paises.put("CL", "Chile");
		paises.put("AR", "Argentina");
		paises.put("CO", "Colombia");
		paises.put("VE", "Venezuela");
		return paises;
	}

	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Jhon");
		usuario.setApellido("Doe");
		usuario.setIdentificador("23.456.789-K");
		usuario.setHabilitar(true);
		usuario.setValorSecreto("Algún valor secreto....");
		usuario.setPais(new Pais(3, "PE", "Perú")); // se implementa toString
		usuario.setRoles(
				Arrays.asList(new Role(2, "Usuario", "ROLE_USER"), new Role(3, "Moderador", "ROLE_MODERATOR")));

		model.addAttribute("titulo", "Formulario usuarios");
		model.addAttribute("usuario", usuario);
//		model.addAttribute("user",usuario);

		return "form";
	}

	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("titulo", "Resultado form");
			return "form";
		}
		return "redirect:/ver";
	}

	@GetMapping("/ver")
	public String ver(@SessionAttribute(name = "usuario", required = false) Usuario usuario, Model model,
			SessionStatus status) {
		if (usuario == null) {
			return "redirect:/form";
		}
		model.addAttribute("titulo", "Resultado form");

		status.setComplete(); // para dejar de guardas los datos de sessiontributes
		return "resultado";
	}

}
