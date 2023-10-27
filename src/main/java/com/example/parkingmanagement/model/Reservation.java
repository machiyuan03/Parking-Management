package com.example.parkingmanagement.model;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private int spotId;
    private int userId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Reservation() {
    }

    public Reservation(int reservationId, int spotId, int userId, LocalDateTime startTime, LocalDateTime endTime) {
        this.reservationId = reservationId;
        this.spotId = spotId;
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
