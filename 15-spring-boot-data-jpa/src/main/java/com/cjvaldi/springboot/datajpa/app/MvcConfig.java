package com.cjvaldi.springboot.datajpa.app;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	//private final Logger log = LoggerFactory.getLogger(getClass());

	
//	  @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	  // TODO Auto-generated method stub
//	  WebMvcConfigurer.super.addResourceHandlers(registry);
//	  
//	  String resourcePath =
//	  Paths.get("uploads").toAbsolutePath().toUri().toString();
//	  
//	  log.info(resourcePath);
//	  
//	  registry.addResourceHandler("/uploads/**")
//	  .addResourceLocations(resourcePath); }
//	 
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/error_403").setViewName("error_403");
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	/**
     * Define dónde se guarda el idioma del usuario (en la sesión HTTP)
     * y establece el idioma por defecto.
     */
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.of("es", "ES")); // Factory method estándar en Java 21
        return localeResolver;
    }

    /**
     * Interceptor que detecta el parámetro en la URL para cambiar el idioma (ej: ?lang=en o ?lang=es).
     */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
        localeInterceptor.setParamName("lang");
        return localeInterceptor;
    }

    /**
     * Registra el interceptor en la cadena de ejecución de Spring MVC.
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
