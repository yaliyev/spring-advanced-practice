package az.developia.july30.jwt.jwtsessionapplicationrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import az.developia.july30.jwt.jwtsessionapplicationrest.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
