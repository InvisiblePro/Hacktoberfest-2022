package com.sinut.authservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinut.authservice.models.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
