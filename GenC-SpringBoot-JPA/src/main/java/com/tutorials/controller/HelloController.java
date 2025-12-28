package com.tutorials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/spring-boot1")
    public String hello1() {
        return "Hello, Spring Boot 1!";
    }

    @GetMapping("/spring-boot2")
    public String hello2() {
        return "Hello, Spring Boot 2!";
    }

}