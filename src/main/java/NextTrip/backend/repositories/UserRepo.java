package NextTrip.backend.repositories;

import NextTrip.backend.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {

    User findByEmail(String email);
}
