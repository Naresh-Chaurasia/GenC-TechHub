package com.javax.jsr330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve a bean from the Spring container
        GreetingService myService = context.getBean(SimpleGreetingService.class);

        System.out.println("Bean retrieved from Spring container: " + myService);
        // Use the bean
        System.out.println(myService.greet("NC"));
    }
}