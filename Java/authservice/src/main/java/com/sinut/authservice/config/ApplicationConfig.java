package com.sinut.authservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.sinut.authservice.repository.ClientRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final ClientRepository clientRepository;

    @Bean
    public UserDetailsService userDetailsService() {
        // Get UserDetails from Db
        return username -> clientRepository.findByUsername(username).orElseThrow();
    }

}
