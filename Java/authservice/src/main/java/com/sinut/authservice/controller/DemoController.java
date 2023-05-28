package com.sinut.authservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/demo")
@Slf4j
public class DemoController {

    @CrossOrigin
    @GetMapping("/")
    public ResponseEntity<String> getHelloWorld() {
        log.info("[Controller Demo]: Got cha");
        return ResponseEntity.ok("Hello World (Secured Endpoint)");
    }

}
