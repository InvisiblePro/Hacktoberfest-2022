package com.sinut.authservice.models;

import java.util.Map;

import javax.naming.directory.NoSuchAttributeException;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public static Role fromJson(Map<String, Object> body) throws NoSuchAttributeException {
        if (body.get("name") == null) {
            throw new NoSuchAttributeException("No Name is given");
        }
        return new Role(body.get("name").toString());
    }
}
