package com.example.parkingmanagement.model;

public class LoginResponse {
    private int userId;
    private String username;

    // 构造函数、getters 和 setters

    public LoginResponse(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

