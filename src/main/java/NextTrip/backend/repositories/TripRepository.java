package NextTrip.backend.repositories;

import NextTrip.backend.models.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripRepository  extends CrudRepository<Trip, Integer> {
}
