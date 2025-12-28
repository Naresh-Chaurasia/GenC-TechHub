package com.autowiring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the GreetingService bean
        GreetingService greetingService1 = context.getBean(GreetingServiceImpl.class);

        GreetingService greetingService2 = context.getBean(HelloServiceImp.class);

        // Call the method
        greetingService1.sayHello();
        greetingService2.sayHello();
    }
}