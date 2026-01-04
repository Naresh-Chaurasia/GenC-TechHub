package com.tutorials.service;

import com.tutorials.dao.UserDao;
import com.tutorials.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
// @Transactional
public class UserService {
    
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userDao.findById(id);
    }

    public User createUser(User user) {
        return userDao.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        return userDao.findById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return userDao.save(user);
        }).orElse(null);
    }

    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }
}