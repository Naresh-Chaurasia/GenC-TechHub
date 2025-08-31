package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/environment")
public class EnvironmentController {

    @Autowired
    private Environment environment;

    @GetMapping
    public Map<String, String> getEnvironmentDetails() {
        Map<String, String> envDetails = new HashMap<>();
        envDetails.put("Java Version", System.getProperty("java.version"));
        envDetails.put("Java Vendor", System.getProperty("java.vendor"));
        envDetails.put("OS Name", System.getProperty("os.name"));
        envDetails.put("OS Version", System.getProperty("os.version"));
        envDetails.put("Spring Application Name", environment.getProperty("spring.application.name"));
        envDetails.put("Active Profiles", String.join(", ", environment.getActiveProfiles()));
        return envDetails;
    }
}