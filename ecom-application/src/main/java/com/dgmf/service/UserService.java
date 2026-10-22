package com.dgmf.service;

import com.dgmf.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Service class for managing users
@Service
public class UserService {
    // In-memory list to store users
    private List<User> userList = new ArrayList<>();

    // Method to fetch all users
    public List<User> fetchAllUsers() {
        // Return the list of users
        return userList;
    }

    // Method to add a new user
    public List<User> addUser(User user) {
        // Add the new user to the list
        userList.add(user);

        // Return the updated list of users
        return userList;
    }
}
