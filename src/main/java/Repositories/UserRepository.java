package Repositories;

import Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> getUserById(long id);

    Optional<User> getUserByUsername(String username);

}
