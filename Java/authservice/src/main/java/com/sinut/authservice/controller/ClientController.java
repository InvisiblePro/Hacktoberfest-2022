package com.sinut.authservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinut.authservice.core.constant.Message;
import com.sinut.authservice.core.error.NoSuchArgsBodyException;
import com.sinut.authservice.models.Client;
import com.sinut.authservice.models.Role;
import com.sinut.authservice.service.ClientService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
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
        Client client;
        try {
            client = Client.fromJson(body);
            clientService.saveUser(client);
            return "Ok";
        } catch (NoSuchArgsBodyException e) {
            log.error(Message.MISSING_ATTRIBUTES, e);
            return Message.MISSING_ATTRIBUTES;
        }
    }

    @CrossOrigin
    @PostMapping("/role/add")
    public @ResponseBody String saveRole(@RequestBody Map<String, Object> body) {
        try {
            Role role = Role.fromJson(body);
            clientService.saveRole(role);
            return "Ok";
        } catch (NoSuchArgsBodyException e) {
            log.error(Message.MISSING_ATTRIBUTES, e);
            return Message.MISSING_ATTRIBUTES;
        }
    }

    @CrossOrigin
    @PostMapping("/user/add-role")
    public @ResponseBody String addRoleToUser(@RequestBody Map<String, Object> body) {
        try {
            if (body.get("username") == null || body.get("rolename") == null) {
                throw new NoSuchArgsBodyException(Message.MISSING_ATTRIBUTES);
            }
            clientService.addRoleToUser(body.get("username").toString(), body.get("rolename").toString());
            return "Ok";
        } catch (NoSuchArgsBodyException e) {
            log.error(Message.MISSING_ATTRIBUTES, e);
            return Message.MISSING_ATTRIBUTES;
        }
    }

    @CrossOrigin
    @GetMapping("/user/{username}")
    public @ResponseBody Client getUser(@PathVariable("username") String username) {
        return clientService.getUser(username);
    }
}
