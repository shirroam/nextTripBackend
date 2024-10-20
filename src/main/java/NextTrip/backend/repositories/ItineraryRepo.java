package NextTrip.backend.repositories;

import NextTrip.backend.models.Itinerary;
import org.springframework.data.repository.CrudRepository;

public interface ItineraryRepo extends CrudRepository<Itinerary, Integer> {
}
