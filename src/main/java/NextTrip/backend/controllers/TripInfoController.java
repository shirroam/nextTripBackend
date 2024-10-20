package NextTrip.backend.controllers;

import NextTrip.backend.models.DTOs.ItineraryItemDTO;
import NextTrip.backend.models.ItineraryItem;
import NextTrip.backend.models.Trip;
import NextTrip.backend.services.TripInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tripInfo")
public class TripInfoController {

    @Autowired
    TripInfoService tripInfoService;

    @PostMapping("/addItem")
    public String addItem(@RequestBody ItineraryItem item) {
        try {
            return tripInfoService.addItem(item);
        }
        catch (Exception e) {
            return "ErrorBC: " + e;
        }
    }

//    @GetMapping("/getAllItems")
//    public List<ItineraryItem> getItems(@RequestParam int itineraryId) {
//        return tripInfoService.getItems(itineraryId);
//    }

    @GetMapping("/getAllItems")
    public List<ItineraryItemDTO> getItems(@RequestParam int itineraryId) {
        return tripInfoService.getItems(itineraryId);
    }
}
