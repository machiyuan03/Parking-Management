package com.example.parkingmanagement.service;

import com.example.parkingmanagement.dao.SpotDBManager;
import com.example.parkingmanagement.model.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpotService {

    private final SpotDBManager spotDBManager;

    @Autowired
    public SpotService(SpotDBManager spotDBManager) {
        this.spotDBManager = spotDBManager;
    }

    public void addSpot(Spot spot) {
        spotDBManager.addSpot(spot);
    }

    public List<Spot> getAllSpots() {
        return spotDBManager.readAllSpot();
    }

    public Spot findSpotById(int id){
        return spotDBManager.findSpotById(id);
    }

    public List<Spot> filterByType(Integer passAvailable, Integer discountAvailable) {
        return spotDBManager.filterByType(passAvailable, discountAvailable);
    }

    public void deleteSpot(int id) {
        spotDBManager.deleteSpot(id);
    }

    public void adjustSpot(Spot spot) {
        spotDBManager.adjustSpot(spot);
    }
}
