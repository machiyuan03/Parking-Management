package com.example.parkingmanagement.service;

import com.example.parkingmanagement.dao.ReservationDBManager;
import com.example.parkingmanagement.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationDBManager reservationDBManager;

    @Autowired
    public ReservationService(ReservationDBManager reservationDBManager) {
        this.reservationDBManager = reservationDBManager;
    }

    public void addReservation(Reservation reservation) {
        reservationDBManager.addReservation(reservation);
    }

    public Reservation findReservationById(int reservationId) {
        return reservationDBManager.findReservationById(reservationId);
    }

    public List<Reservation> getReservationsByUser(int userId) {
        return reservationDBManager.getReservationsByUser(userId);
    }

    public List<Reservation> getAllReservations() {
        return reservationDBManager.getAllReservations();
    }

    public void modifyReservation(Reservation reservation) {
        reservationDBManager.modifyReservation(reservation);
    }

    public void deleteReservation(int reservationId) {
        reservationDBManager.deleteReservation(reservationId);
    }
}
