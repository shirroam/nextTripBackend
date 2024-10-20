package NextTrip.backend.repositories;

import NextTrip.backend.models.ItineraryItem;
import org.springframework.data.repository.CrudRepository;

public interface ItineraryItemRepo extends CrudRepository<ItineraryItem, Integer> {
}
