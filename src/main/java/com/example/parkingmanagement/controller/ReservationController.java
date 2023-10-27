package com.example.parkingmanagement.controller;

import com.example.parkingmanagement.model.Reservation;
import com.example.parkingmanagement.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    // Add a new reservation using request body
    @PostMapping("/addReservation")
    public void addReservation(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
    }

    // Fetch reservations by a user ID using request parameter
    @GetMapping("/getReservationsByUser")
    public List<Reservation> getReservationsByUser(@RequestParam int userId) {
        return reservationService.getReservationsByUser(userId);
    }

    // Fetch reservations by a user ID using request parameter
    @GetMapping("/getAllReservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // Fetch a specific reservation by its ID using request parameter
    @GetMapping("/findReservationById")
    public Reservation findReservationById(@RequestParam int reservationId) {
        return reservationService.findReservationById(reservationId);
    }

    // Modify a reservation using request body
    @PostMapping("/modifyReservation")
    public void modifyReservation(@RequestBody Reservation reservation) {
        reservationService.modifyReservation(reservation);
    }

    // Delete a reservation by its ID using request parameter
    @PostMapping("/deleteReservation")
    public void deleteReservation(@RequestParam int reservationId) {
        reservationService.deleteReservation(reservationId);
    }
}