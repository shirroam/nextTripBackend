package NextTrip.backend.services;

import NextTrip.backend.models.DTOs.ItineraryItemDTO;
import NextTrip.backend.models.Itinerary;
import NextTrip.backend.models.ItineraryItem;
import NextTrip.backend.models.Trip;
import NextTrip.backend.repositories.ItineraryItemRepo;
import NextTrip.backend.repositories.ItineraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

//    public List<ItineraryItem> getItems(int itineraryId) {
//
//        //check if a itinerary with this itineraryId exists
//        if(itineraryRepo.existsById(itineraryId)) {
//            return itineraryItemRepo.findItemsByItineraryId(itineraryId);
//        }
//
//        return null;
//    }

    public List<ItineraryItemDTO> getItems(int itineraryId) {
        List<ItineraryItemDTO> itemsDTO = new ArrayList<>();

        if(itineraryRepo.existsById(itineraryId)) {
            for(ItineraryItem itineraryItem:itineraryItemRepo.findItemsByItineraryId(itineraryId)) {
                ItineraryItemDTO itemDTO = new ItineraryItemDTO(itineraryItem);
                itemsDTO.add(itemDTO);
            }
        }

        return itemsDTO;
    }
}
