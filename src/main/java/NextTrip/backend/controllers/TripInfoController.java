package NextTrip.backend.controllers;

import NextTrip.backend.models.ItineraryItem;
import NextTrip.backend.services.TripInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
