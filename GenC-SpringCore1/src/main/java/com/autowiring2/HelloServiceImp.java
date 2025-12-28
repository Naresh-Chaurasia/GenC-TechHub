package com.autowiring2;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements GreetingService {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}