package NextTrip.backend.services;

import NextTrip.backend.models.Itinerary;
import NextTrip.backend.models.Trip;
import NextTrip.backend.repositories.ItineraryRepo;
import NextTrip.backend.repositories.TripRepo;
import NextTrip.backend.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class TripService {

    @Autowired
    TripRepo tripRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ItineraryRepo itineraryRepo;

    //add a Trip to all existing Trips of user 1
    public String addTrip(Trip trip) {

        //save input Trip to repo
        trip.setCreatedDate(new Date());
        trip.setStatus("upcoming");
        trip.setUser(userRepo.findById(1).get());

        tripRepo.save(trip);

        //create itinerary for this new Trip
        Itinerary itinerary = new Itinerary();
        itinerary.setTrip(trip);
        itinerary.setAmount(0);

        itineraryRepo.save(itinerary);
        return "New trip added: " + trip.getName();
    }

    public List<Trip> getTrips(int userId) {

        //check if a user with this userId exists
        if(userRepo.existsById(userId)) {
            return tripRepo.findTripsByUserId(userId);
        }

        return null;
    }

    public Trip getTrip(int tripId) {
        //check if a trip with this tripId exists
        if(tripRepo.existsById(tripId)) {
            return tripRepo.findById(tripId).get();
        }

        return null;
    }


    //get all Trips of this user
}
