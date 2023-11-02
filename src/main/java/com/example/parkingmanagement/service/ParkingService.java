package com.example.parkingmanagement.service;

import com.example.parkingmanagement.dao.ParkingDBManager;
import com.example.parkingmanagement.model.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingService {
    @Autowired
    private ParkingDBManager parkingDBManager;

    public List<Parking> getParkingById(int user_id){
        return parkingDBManager.getParkingById(user_id);
    }
}
