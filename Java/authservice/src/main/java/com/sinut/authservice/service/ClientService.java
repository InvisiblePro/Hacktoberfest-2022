package com.sinut.authservice.service;

import java.util.List;

import com.sinut.authservice.models.Role;
import com.sinut.authservice.models.User;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String rolename);

    User getUser(String username);

    List<User> getUsers();
}
