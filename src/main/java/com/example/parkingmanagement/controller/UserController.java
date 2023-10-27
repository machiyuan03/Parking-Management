package com.example.parkingmanagement.controller;


import com.example.parkingmanagement.model.LoginResponse;
import com.example.parkingmanagement.model.User;
import com.example.parkingmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return new LoginResponse(loggedInUser.getUserId(), loggedInUser.getUsername());
    }
}
