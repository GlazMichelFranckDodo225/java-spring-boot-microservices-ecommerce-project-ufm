package com.dgmf.controller;

import com.dgmf.entity.User;
import com.dgmf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<User>> getAllUsers() {
        // Return the list of users
        return new ResponseEntity<>(
                userService.fetchAllUsers(), HttpStatus.OK
        );
        // return ResponseEntity.ok(userService.fetchAllUsers());
    }

    // Endpoint to retrieve User by ID
    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return userService.fetchUser(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint to create a new user
    @PostMapping("/api/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Add the new user to the list
        userService.addUser(user);

        // Return a success message
        return ResponseEntity.ok("User created successfully");
    }
}
