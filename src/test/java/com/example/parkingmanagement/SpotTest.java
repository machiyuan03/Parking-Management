package com.example.parkingmanagement;

import com.example.parkingmanagement.model.Spot;
import com.example.parkingmanagement.service.SpotService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // To execute tests in order by name
public class SpotTest {
    @Autowired
    private SpotService spotService;

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

    @Test
    public void test2QuerySpot() {
        // Assume the last added spot has the maximum ID
        List<Spot> spots = spotService.getAllSpots();
        Spot lastAddedSpot = spots.get(spots.size() - 1);

        assertEquals("Sample Location", lastAddedSpot.getLocation());
    }

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

    @Test
    public void test4DeleteSpot() {
        List<Spot> spots = spotService.getAllSpots();
        Spot lastSpot = spots.get(spots.size() - 1);
        spotService.deleteSpot(lastSpot.getId());
    }
}
