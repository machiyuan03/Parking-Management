package com.example.parkingmanagement.controller;

import com.example.parkingmanagement.model.Pass;
import com.example.parkingmanagement.model.PassWithDetails;
import com.example.parkingmanagement.model.PurchaseRequest;
import com.example.parkingmanagement.model.User;
import com.example.parkingmanagement.service.PassService;
import com.example.parkingmanagement.service.UserPassService;
import com.example.parkingmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserPassController {

    @Autowired
    private UserService userService;

    @Autowired
    private PassService passService;

    @Autowired
    private UserPassService userPassService;

    // Fetch user by ID
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable int userId) {
        User user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }

    // Get all available passes
    @GetMapping("/passes")
    public ResponseEntity<List<Pass>> getAllPasses() {
        List<Pass> passes = passService.getAllPasses();
        return ResponseEntity.ok(passes);
    }

    // Buy a pass for a user
    @PostMapping("/{userId}/purchase")
    public ResponseEntity<String> purchasePass(@PathVariable int userId,
                                               @RequestBody PurchaseRequest request) {
        try {
            userPassService.purchasePass(userId, request.getPassId(), request.getPurchaseDate());
            return ResponseEntity.ok("Pass purchased successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error purchasing pass!");
        }
    }

    // Get all passes for a user
    @GetMapping("/{userId}/passes")
    public ResponseEntity<List<PassWithDetails>> getUserPasses(@PathVariable int userId) {
        List<PassWithDetails> passDetails = userPassService.getUserPassDetails(userId);
        return ResponseEntity.ok(passDetails);
    }
}

