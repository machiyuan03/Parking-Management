package com.example.parkingmanagement.controller;

import com.example.parkingmanagement.model.Spot;
import com.example.parkingmanagement.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpotController {

    @Autowired
    private SpotService spotService;

    @GetMapping("/getAllSpot")
    public List<Spot> getAllSpot() {
        return spotService.getAllSpots();
    }

    @GetMapping("/findSpotById")
    public Spot findSpotById(@RequestParam int id) {
        return spotService.findSpotById(id);
    }

    @PostMapping("/addSpot")
    public void addSpot(
            @RequestParam String location,
            @RequestParam double priceRatePH,
            @RequestParam double priceRatePD,
            @RequestParam double priceRateON,
            @RequestParam int sSpot,
            @RequestParam int mSpot,
            @RequestParam int lSpot,
            @RequestParam int passAvailable,
            @RequestParam int discountAvailable) {

        Spot spot = new Spot(location, priceRatePH, priceRatePD, priceRateON,
                sSpot, mSpot, lSpot, passAvailable, discountAvailable);
        spotService.addSpot(spot);
    }

    @PostMapping("/adjustSpot")
    public void adjustSpot(
            @RequestParam int id,
            @RequestParam String location,
            @RequestParam double priceRatePH,
            @RequestParam double priceRatePD,
            @RequestParam double priceRateON,
            @RequestParam int sSpot,
            @RequestParam int mSpot,
            @RequestParam int lSpot,
            @RequestParam int passAvailable,
            @RequestParam int discountAvailable) {

        Spot spot = new Spot(id, location, priceRatePH, priceRatePD, priceRateON,
                sSpot, mSpot, lSpot, passAvailable, discountAvailable);
        spotService.adjustSpot(spot);
    }

    @PostMapping("/filterSpotServlet")
    public List<Spot> filterSpotServlet(
            @RequestParam int passAvailable,
            @RequestParam int discountAvailable) {

        return spotService.filterByType(passAvailable, discountAvailable);
    }

    @PostMapping("/deleteSpot")
    public void deleteSpot(@RequestParam int id) {
        spotService.deleteSpot(id);
    }
}
