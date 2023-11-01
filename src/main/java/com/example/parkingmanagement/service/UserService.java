package com.example.parkingmanagement.service;

import com.example.parkingmanagement.dao.UserDBManager;
import com.example.parkingmanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<User> getAllUsers() {
        return userDBManager.getAllUsers();
    }

    public User login(String username, String password) {
        return userDBManager.findByUsernameAndPassword(username, password);
    }

    public void updateDiscountPercentage(int userId, int discountPercentage) {
        userDBManager.updateDiscountPercentage(userId, discountPercentage);
    }

    public User getUserById(int userId) {
        return userDBManager.getUserById(userId);
    }
}
