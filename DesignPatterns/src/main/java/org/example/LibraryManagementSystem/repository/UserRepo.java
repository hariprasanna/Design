package org.example.LibraryManagementSystem.repository;

import org.example.LibraryManagementSystem.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    Map<String, User> users = new HashMap<>();
    public UserRepo() {
        users = new HashMap<>();
    }
    public User getUser(String userId) {
        return users.get(userId);
    }
    public void addUser(String userId, User user) {
        users.put(userId, user);
    }
}