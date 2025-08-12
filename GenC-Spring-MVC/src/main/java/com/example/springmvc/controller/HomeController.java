package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springmvc.model.User;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome() {
        return "home"; // This returns the view name for the home page
    }

    @GetMapping("/user")
    public String getHome(Model model) {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john@example.com");
        model.addAttribute("user", user);
        return "user"; // This returns the view name for the home page
    }
}