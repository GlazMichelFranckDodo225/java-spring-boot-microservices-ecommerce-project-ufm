package com.dgmf.service;

import com.dgmf.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Service class for managing users
@Service
public class UserService {
    // In-memory list to store users
    private List<User> userList = new ArrayList<>();
    // Variable to keep track of the next user ID
    private Long nextId = 1L;

    // Method to fetch all users
    public List<User> fetchAllUsers() {
        // Return the list of users
        return userList;
    }

    // Method to add a new user
    public void addUser(User user) {
        // Assign an ID to the new user
        user.setId(nextId++);
        // Add the new user to the list
        userList.add(user);
    }

    // Method to fetch a user by ID
    public Optional<User> fetchUser(Long id) {
        // Return the first user found with the given ID
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}
