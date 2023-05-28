package com.sinut.authservice.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sinut.authservice.enumeration.Role;
import com.sinut.authservice.model.api.AuthenticationRequest;
import com.sinut.authservice.model.api.AuthenticationResponse;
import com.sinut.authservice.model.api.RegisterRequest;
import com.sinut.authservice.model.entity.Client;
import com.sinut.authservice.repository.ClientRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthenticationService {

    private final ClientRepository clientRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public AuthenticationResponse register(RegisterRequest request) {
        log.info("[Service]: " + request.toString());

        Client client = Client
                .builder()
                .name(request.getFirstname() + " " + request.getLastname())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        clientRepo.save(client);
        String token = jwtService.generateToken(client);
        return AuthenticationResponse
                .builder()
                .token(token)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()));

        Client client = clientRepo.findByUsername(request.getUsername()).orElseThrow();
        String jwtToken = jwtService.generateToken(client);

        return AuthenticationResponse
                .builder()
                .token(jwtToken)
                .build();
    }

}
