package method.factory.infrastructure.repository;

import method.factory.infrastructure.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
