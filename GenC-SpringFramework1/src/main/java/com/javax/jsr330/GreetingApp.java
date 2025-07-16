package com.javax.jsr330;

import javax.inject.Inject;
import javax.inject.Named;

public class GreetingApp {

    private final GreetingService greetingService;

    // Constructor injection using @Inject
    @Inject
    public GreetingApp(@Named("simpleGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void run() {
        System.out.println(greetingService.greet("John"));
    }
}