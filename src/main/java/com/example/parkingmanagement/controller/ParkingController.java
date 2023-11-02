package com.example.parkingmanagement.controller;

import com.example.parkingmanagement.model.Parking;
import com.example.parkingmanagement.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingController {
    private final ParkingService parkingService;

    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping("/parking/{userId}")
    public ResponseEntity<List<Parking>> getParkingById(@PathVariable int userId) {
        List<Parking> result = parkingService.getParkingById(userId);
        return ResponseEntity.ok(result);
    }
}
