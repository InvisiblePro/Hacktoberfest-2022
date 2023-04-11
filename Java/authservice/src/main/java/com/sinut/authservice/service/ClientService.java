package com.sinut.authservice.service;

import java.util.List;

import com.sinut.authservice.models.Role;
import com.sinut.authservice.models.Client;

public interface ClientService {
    Client saveUser(Client user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String rolename);

    Client getUser(String username);

    List<Client> getUsers();
}
