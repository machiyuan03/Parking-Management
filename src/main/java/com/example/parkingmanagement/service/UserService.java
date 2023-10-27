package com.example.parkingmanagement.service;

import com.example.parkingmanagement.dao.UserDBManager;
import com.example.parkingmanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDBManager userDBManager;

    @Autowired
    public UserService(UserDBManager userDBManager) {
        this.userDBManager = userDBManager;
    }

    public void registerUser(User user) {
        userDBManager.addUser(user);
    }

    public User findUserByUsername(String username) {
        return userDBManager.findByUsername(username);
    }

    public User login(String username, String password) {
        return userDBManager.findByUsernameAndPassword(username, password);
    }
}
