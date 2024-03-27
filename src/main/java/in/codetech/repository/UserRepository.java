package in.codetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserName(String userName) ;
}
