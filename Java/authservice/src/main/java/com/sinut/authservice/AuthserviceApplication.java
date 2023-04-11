package com.sinut.authservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sinut.authservice.models.Client;
import com.sinut.authservice.models.Role;
import com.sinut.authservice.service.ClientService;

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
	CommandLineRunner runner(ClientService clientService) {
		return args -> {

			clientService.saveUser(new Client("Sinut Wattanarporn", "cheesecake", "cheeeees"));
			clientService.saveUser(new Client("Badamum John", "johnsnow", "dice1234"));

			clientService.saveRole(new Role("ROOT"));
			clientService.saveRole(new Role("GROUP 1"));
			clientService.saveRole(new Role("GROUP 2"));

			clientService.addRoleToUser("cheesecake", "ROOT");
			clientService.addRoleToUser("johnsnow", "GROUP 1");
			clientService.addRoleToUser("johnsnow", "GROUP 2");
		};
	}
}
