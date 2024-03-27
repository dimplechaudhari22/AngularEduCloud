package in.codetech.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;

import in.codetech.model.User;
import in.codetech.model.UserRole;
import in.codetech.util.ResponseStructure;

public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles) throws Exception ;
	
//	public ResponseEntity<ResponseStructure<User>> findUserById(long id) ;
//	
//	public ResponseStructure<List<User>> findAllUser() ;
//	
//	public ResponseEntity<ResponseStructure<User>> deleteUserById(long id) ;
//	
//	public ResponseEntity<ResponseStructure<User>> updateUser(long id, User user, Set<UserRole> userRoles) ;
	
}
