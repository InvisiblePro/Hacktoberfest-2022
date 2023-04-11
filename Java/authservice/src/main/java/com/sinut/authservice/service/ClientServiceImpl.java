package com.sinut.authservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinut.authservice.models.Role;
import com.sinut.authservice.models.Client;
import com.sinut.authservice.repo.RoleRepo;
import com.sinut.authservice.repo.ClientRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ClientServiceImpl implements ClientService {

    @Autowired
    private final ClientRepo userRepo;

    @Autowired
    private final RoleRepo roleRepo;

    @Override
    public Client saveUser(Client user) {
        log.info("Saving user to db: " + user.getName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving role to db: " + role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {
        Client user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(rolename);
        log.info("Add Role to user " + username + " with role " + rolename);
        user.getRoles().add(role);
    }

    @Override
    public Client getUser(String username) {
        log.info("Fetching user: " + username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<Client> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }

}
