package co.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.sumit.entity.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByUsername(String username);
}
