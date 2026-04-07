package com.springbeans7;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "com.springbeans7")
public class AppConfig {

    @PostConstruct
    public void onStartup() {
        System.out.println("Spring context initialized - @PostConstruct processing enabled");
    }
}