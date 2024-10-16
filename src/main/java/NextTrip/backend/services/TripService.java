package NextTrip.backend.services;

import NextTrip.backend.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripService {

    @Autowired
    TripRepository tripRepository;

    //add a Trip to all existing Trips of user with userID


    //get all Trips of this user
}
