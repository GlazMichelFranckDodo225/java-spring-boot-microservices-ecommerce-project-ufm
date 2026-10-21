package com.dgmf.controller;

import com.dgmf.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Controller for handling user-related requests
@RestController
public class UserController {
    // In-memory list to store users
    private List<User> userList = new ArrayList<>();

    // Endpoint to retrieve all users
    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        // Return the list of users
        return userList;
    }

    @PostMapping("/api/users")
    public List<User> createUser(@RequestBody User user) {
        // Add the new user to the list
        userList.add(user);

        // Return the updated list of users
        return userList;
    }
}
