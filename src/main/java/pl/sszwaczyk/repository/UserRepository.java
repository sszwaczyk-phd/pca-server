package pl.sszwaczyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sszwaczyk.domain.User;

/**
 * Created by sszwaczyk on 10.07.17.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
