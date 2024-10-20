package NextTrip.backend.repositories;

import NextTrip.backend.models.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepo extends CrudRepository<Trip, Integer> {

    Trip findByName(String name);
    Boolean existsByName(String name);
//    List<Trip> findByUser(int userId);

    @Query(
            value = "SELECT t.* FROM trip t WHERE t.user_id = ?1",
            nativeQuery = true)
    List<Trip> findTripsByUserId(int userId);
}
