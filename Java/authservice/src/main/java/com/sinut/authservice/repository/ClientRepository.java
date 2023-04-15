package com.sinut.authservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinut.authservice.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByUsername(String username);
}
