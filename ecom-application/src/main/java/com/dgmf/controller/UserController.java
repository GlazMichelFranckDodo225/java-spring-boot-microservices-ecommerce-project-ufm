package com.dgmf.controller;

import com.dgmf.entity.User;
import com.dgmf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/users/{id}")
    public User getUser(@PathVariable Long id) {
        // Fetch the user by ID (not implemented in UserService)
        return userService.fetchUser(id);
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
