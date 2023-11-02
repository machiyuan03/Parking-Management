package com.example.parkingmanagement;

import com.example.parkingmanagement.model.Spot;
import com.example.parkingmanagement.service.SpotService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SpotTest {
    @Autowired
    private SpotService spotService;

    @Order(1)
    @Test
    public void test1AddSpot() {
        Spot newSpot = new Spot();
        newSpot.setLocation("Sample Location");
        newSpot.setPriceRatePH(10.0);
        newSpot.setPriceRatePD(50.0);
        newSpot.setPriceRateON(100.0);
        newSpot.setsSpot(5);
        newSpot.setmSpot(10);
        newSpot.setlSpot(15);
        newSpot.setPassAvailable(1);
        newSpot.setDiscountAvailable(1);
        spotService.addSpot(newSpot);
    }

    @Order (2)
    @Test
    public void test2QuerySpot() {
        // Assume the last added spot has the maximum ID
        List<Spot> spots = spotService.getAllSpots();
        Spot lastAddedSpot = spots.get(spots.size() - 1);

        assertEquals("Sample Location", lastAddedSpot.getLocation());
    }

    @Order (3)
    @Test
    public void test3ModifySpot() {
        List<Spot> spots = spotService.getAllSpots();
        Spot lastAddedSpot = spots.get(spots.size() - 1);

        lastAddedSpot.setLocation("Modified Location");
        lastAddedSpot.setPriceRatePH(20.0);
        lastAddedSpot.setPriceRatePD(60.0);
        lastAddedSpot.setPriceRateON(120.0);
        lastAddedSpot.setsSpot(6);
        lastAddedSpot.setmSpot(11);
        lastAddedSpot.setlSpot(16);
        lastAddedSpot.setPassAvailable(2);
        lastAddedSpot.setDiscountAvailable(2);
        spotService.adjustSpot(lastAddedSpot);
    }

    @Order (4)
    @Test
    public void test4DeleteSpot() {
        List<Spot> spots = spotService.getAllSpots();
        Spot lastSpot = spots.get(spots.size() - 1);
        spotService.deleteSpot(lastSpot.getId());
    }
}
