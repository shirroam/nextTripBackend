package NextTrip.backend.controllers;

import NextTrip.backend.models.DTOs.TripDTO;
import NextTrip.backend.models.Trip;
import NextTrip.backend.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAllTrips")
    public List<Trip> getTrips(@RequestParam int userId) {
        return tripService.getTrips(userId);
    }

    @GetMapping("/getTrip")
    public Trip getTrip(@RequestParam int tripId) {
        return tripService.getTrip(tripId);
    }
}
