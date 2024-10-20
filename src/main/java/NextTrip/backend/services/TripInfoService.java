package NextTrip.backend.services;

import NextTrip.backend.models.Itinerary;
import NextTrip.backend.models.ItineraryItem;
import NextTrip.backend.repositories.ItineraryItemRepo;
import NextTrip.backend.repositories.ItineraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripInfoService {

    @Autowired
    ItineraryItemRepo itineraryItemRepo;

    @Autowired
    ItineraryRepo itineraryRepo;

    //add a ItineraryItem to the Itinerary of the current Trip
    public String addItem(ItineraryItem item) {

        Itinerary currentItinerary = itineraryRepo.findById(1).get();

        //save input item to repo
        item.setItinerary(currentItinerary);
        itineraryItemRepo.save(item);

        //increment amount of Itinerary with one
        currentItinerary.setAmount(currentItinerary.getAmount() + 1);
        itineraryRepo.save(currentItinerary);

        return "New item added: " + item.getName();
    }
}
