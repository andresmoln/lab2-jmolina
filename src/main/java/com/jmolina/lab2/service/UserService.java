package com.jmolina.lab2.service;

import com.jmolina.lab2.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static UserService instance;
    private final List<User> users;

    private UserService() {
        users = new ArrayList<>();
        users.add(new User("jmolina", "SecurePass123!", true));
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public boolean authenticate(String username, String password) {
        for (User user : users) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword()) && user.isActive()) {
                return true;
            }
        }
        return false;
    }

    public boolean userExists(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUsername(String oldUsername, String newUsername) {
        for (User user : users) {
            if (user.getUsername().equals(oldUsername)) {
                user.setUsername(newUsername);
                return;
            }
        }
    }

    public void deactivateUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.setActive(false);
                return;
            }
        }
    }

    public void activateUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.setActive(true);
                return;
            }
        }
    }

    public void updatePassword(String username, String newPassword) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.setPassword(newPassword);
                return;
            }
        }
    }
}
