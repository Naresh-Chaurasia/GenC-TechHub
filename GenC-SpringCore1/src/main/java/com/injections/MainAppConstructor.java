package com.injections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppConstructor {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ConstructorInjectionExample constructorInjection = context.getBean(ConstructorInjectionExample.class);
        
        
        constructorInjection.printMessage();

    
    }
}