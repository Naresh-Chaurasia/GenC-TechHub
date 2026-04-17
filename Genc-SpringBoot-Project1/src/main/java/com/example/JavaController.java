package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// RestController = Controller + Some other capabilities

@RestController
public class JavaController {

    @GetMapping("/java")
    public String sayJava() {
        return "Java World";
    }

   
}
