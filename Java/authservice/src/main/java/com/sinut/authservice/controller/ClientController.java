package com.sinut.authservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinut.authservice.models.Client;
import com.sinut.authservice.service.ClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @CrossOrigin
    @GetMapping("/users")
    public @ResponseBody List<Client> getUsers() {
        return clientService.getUsers();
    }

    @CrossOrigin
    @PostMapping("/user/add")
    public @ResponseBody String saveUsers(@RequestBody Map<String, Object> body) {
        Client client = Client.fromJson(body);
        clientService.saveUser(client);
        return "Ok";
    }
}
