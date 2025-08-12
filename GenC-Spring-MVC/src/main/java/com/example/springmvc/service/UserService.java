package com.example.springmvc.service;

import com.example.springmvc.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public void saveUser(User user) {
        users.add(user);
    }
}