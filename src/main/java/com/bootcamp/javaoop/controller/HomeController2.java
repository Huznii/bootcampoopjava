package com.bootcamp.javaoop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController2 {
    @GetMapping("home")
    public ResponseEntity<Object> index() {
        return ResponseEntity.ok()
                .body("Welcome to the Jungle");
    }
}
