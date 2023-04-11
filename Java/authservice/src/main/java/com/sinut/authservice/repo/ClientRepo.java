package com.sinut.authservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinut.authservice.models.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {
    Client findByUsername(String username);
}
