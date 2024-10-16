package NextTrip.backend.services;

import NextTrip.backend.models.DTOs.TripDTO;
import NextTrip.backend.models.Trip;
import NextTrip.backend.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripService {

    @Autowired
    TripRepository tripRepository;

    //add a Trip to all existing Trips of user 1
    public String addTrip(Trip trip) {
        return "Book added";
    }




    //get all Trips of this user
}
