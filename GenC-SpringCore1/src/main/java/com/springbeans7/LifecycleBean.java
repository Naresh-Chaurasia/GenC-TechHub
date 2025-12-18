package com.springbeans7;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifecycleBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean initialized");
    }

    public void performAction() {
        System.out.println("Performing action in LifecycleBean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean destroyed");
    }
}