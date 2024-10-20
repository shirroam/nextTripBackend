package NextTrip.backend.repositories;

import NextTrip.backend.models.ItineraryItem;
import NextTrip.backend.models.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItineraryItemRepo extends CrudRepository<ItineraryItem, Integer> {

    @Query(
            value = "SELECT ii.* FROM itinerary_item ii WHERE ii.itinerary_id = ?1",
            nativeQuery = true)
    List<ItineraryItem> findItemsByItineraryId(int itineraryId);
}
