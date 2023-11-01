package com.example.parkingmanagement.service;

import com.example.parkingmanagement.dao.UserPassDBManager;
import com.example.parkingmanagement.model.Pass;
import com.example.parkingmanagement.model.PassWithDetails;
import com.example.parkingmanagement.model.UserPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class UserPassService {

    @Autowired
    private UserPassDBManager userPassDBManager;

    @Autowired
    private PassService passService;

    public void purchasePass(int userId, int passId, Date purchaseDate) {
        Pass pass = passService.getPassById(passId);
        Calendar cal = Calendar.getInstance();
        cal.setTime(purchaseDate);
        cal.add(Calendar.DAY_OF_MONTH, pass.getTotal_duration()); // Assuming duration is in days
        Date expiryDate = cal.getTime();

        userPassDBManager.purchasePass(userId, passId, purchaseDate, expiryDate);
    }

    public List<UserPass> getUserPasses(int userId) {
        return userPassDBManager.getUserPasses(userId);
    }

    public List<PassWithDetails> getUserPassDetails(int userId) {
        return userPassDBManager.getUserPassDetails(userId);
    }
}

