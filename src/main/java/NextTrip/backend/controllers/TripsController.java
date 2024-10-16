package NextTrip.backend.controllers;

import NextTrip.backend.models.DTOs.TripDTO;
import NextTrip.backend.models.Trip;
import NextTrip.backend.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/trips")
public class TripsController {

    @Autowired
    TripService tripService;

    @PostMapping("/addTrip")
    public String addTrip(@RequestBody Trip trip) {
        try {
            return tripService.addTrip(trip);
        }
        catch (Exception e) {
            return "ErrorBC: " + e;
        }
    }
}
