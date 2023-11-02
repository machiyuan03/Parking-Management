package com.example.parkingmanagement.model;

public class Parking {
    private int id;
    private int user_id;
    private String time_slot;
    private int numbers;

    public Parking(int id, int user_id, String time_slot, int numbers) {
        this.id = id;
        this.user_id = user_id;
        this.time_slot = time_slot;
        this.numbers = numbers;
    }

    public Parking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(String time_slot) {
        this.time_slot = time_slot;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
}
