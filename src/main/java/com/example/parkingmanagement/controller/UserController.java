package com.example.parkingmanagement.controller;


import com.example.parkingmanagement.model.LoginResponse;
import com.example.parkingmanagement.model.Reservation;
import com.example.parkingmanagement.model.User;
import com.example.parkingmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        userService.registerUser(user);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody User user) {
        User loggedInUser = userService.login(user.getUsername(), user.getPassword());
        System.out.println(userService.login(user.getUsername(), user.getPassword()).getUserId());
        return new LoginResponse(loggedInUser.getUserId(), loggedInUser.getUsername());
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllReservations() {
        return userService.getAllUsers();
    }

    @PutMapping("/updateDiscount/{userId}")
    public void updateDiscount(@PathVariable int userId, @RequestParam int discountPercentage) {
        userService.updateDiscountPercentage(userId, discountPercentage);
    }
}
