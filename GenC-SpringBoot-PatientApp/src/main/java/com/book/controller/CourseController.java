package com.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @GetMapping
    public List<String> getCourses() {
        return Arrays.asList("Spring Boot", "Spring Framework", "Java", "Microservices", "Hibernate");
    }
}