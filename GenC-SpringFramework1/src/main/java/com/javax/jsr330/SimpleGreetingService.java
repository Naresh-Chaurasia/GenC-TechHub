package com.javax.jsr330;

import javax.inject.Named;

@Named("simpleGreetingService") // Marks this class as a named bean
public class SimpleGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
