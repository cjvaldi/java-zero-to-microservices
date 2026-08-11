package com.cjvaldi.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cjvaldi.springboot.error.app.errors.UsuarioNoEncontradoException;

@ControllerAdvice
public class ErrorHandlerController {

	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticalError(Exception ex, Model model) {
		model.addAttribute("error", "Error de aritmetica");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/aritmetica";
	}

//	Se pueden generar vistas genericas o para cada error
	@ExceptionHandler(NumberFormatException.class)
	public String numeroFormatoError(NumberFormatException ex, Model model) {
		model.addAttribute("error", "Formato de número inválido");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numero-formato";
	}

	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public String numeroFormatoError(UsuarioNoEncontradoException ex, Model model) {
		model.addAttribute("error", "Usuario no encontrado");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/generica";
	}
	
}
