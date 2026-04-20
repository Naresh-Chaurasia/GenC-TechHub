package com.tutorials.controller1;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api1/users")
public class InMemoryController1 {
    
    private final List<User> users = new ArrayList<>();
    private Long nextId = 1L;
    
    // CREATE - Add a new user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        user.setId(nextId++);
        users.add(user);
        return ResponseEntity.ok(user);
    }
    
    // READ - Get all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(users);
    }
    
    // READ - Get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = users.stream()
            .filter(u -> u.getId().equals(id))
            .findFirst();
        
        return user.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }
    
    // UPDATE - Update an existing user
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                updatedUser.setId(id);
                users.set(i, updatedUser);
                return ResponseEntity.ok(updatedUser);
            }
        }
        return ResponseEntity.notFound().build();
    }
    
    // DELETE - Delete a user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        boolean removed = users.removeIf(user -> user.getId().equals(id));
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
    
    // User model class
    public static class User {
        private Long id;
        private String name;
        private String email;
        
        public User() {}
        
        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }
        
        public Long getId() {
            return id;
        }
        
        public void setId(Long id) {
            this.id = id;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getEmail() {
            return email;
        }
        
        public void setEmail(String email) {
            this.email = email;
        }
    }
}
