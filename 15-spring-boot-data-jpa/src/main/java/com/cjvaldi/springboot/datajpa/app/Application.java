package com.cjvaldi.springboot.datajpa.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cjvaldi.springboot.datajpa.app.models.service.IUploadFileService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	
	private final UserDetailsService userDetailsService;
	final IUploadFileService uploadFileService;
	final BCryptPasswordEncoder passwordEncoder;

	Application(IUploadFileService uploadFileService, BCryptPasswordEncoder passwordEncoder, UserDetailsService userDetailsService) {
		this.uploadFileService = uploadFileService;
		this.passwordEncoder = passwordEncoder;
		this.userDetailsService = userDetailsService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		uploadFileService.deleteAll();
		uploadFileService.init();
		
		String password ="12345";
		
		for(int i= 0; i<2; ++i) {
			String bcryptPassword = passwordEncoder.encode(password);
			System.out.println(bcryptPassword);
		}
		
	}

}
