package com.sinut.authservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthserviceApplication.class, args);
	}

	@Bean
	/**
	 * Application Initialization
	 * 
	 * @param clientService
	 * @return
	 */
	CommandLineRunner runner() {
		return args -> {

		};
	}
}
