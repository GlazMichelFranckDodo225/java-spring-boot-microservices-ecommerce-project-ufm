package com.dgmf.controller;

import com.dgmf.entity.User;
import com.dgmf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Controller for handling user-related requests
@RestController
@RequiredArgsConstructor
public class UserController {
    // Injecting the UserService to handle business logic
    private final UserService userService;

    // Endpoint to retrieve all users
    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        // Return the list of users
        return userService.fetchAllUsers();
    }

    // Endpoint to create a new user
    @PostMapping("/api/users")
    public String createUser(@RequestBody User user) {
        // Add the new user to the list
        userService.addUser(user);

        // Return a success message
        return "User created successfully";
    }
}
