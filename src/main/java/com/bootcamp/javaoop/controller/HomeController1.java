package com.bootcamp.javaoop.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController1 {
    @GetMapping
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok()
                .body("Welcome to the Jungle");
    }
}
