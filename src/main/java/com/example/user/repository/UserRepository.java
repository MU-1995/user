package com.example.user.repository;

import com.example.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();
    private int userId;

    public UserRepository() {
        populateUsers();
    }

    public void populateUsers() {
        users.add(new User(++userId, "Martin"));
        users.add(new User(++userId, "Morten"));
    }

    public User addUser(User user) {
        userId++;
        user.setId(userId);
        users.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return users;
    }
}