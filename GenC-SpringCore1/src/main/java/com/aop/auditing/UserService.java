package com.aop.auditing;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(String name) {
        System.out.println("User created: " + name);
    }

    public void deleteUser(String id) {
        System.out.println("User deleted: " + id);
    }
}