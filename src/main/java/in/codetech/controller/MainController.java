package in.codetech.controller;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.codetech.model.User;
import in.codetech.model.UserRole;
import in.codetech.service.UserServiceImp;
import in.codetech.util.ResponseStructure;

@RestController
public class MainController {

//	@Autowired
//	private UserServiceImp userServiceImp;
//
//	@PostMapping("/saveUser")
//	public ResponseStructure<User> saveUser(@RequestBody User user, HashSet<UserRole> userRoles) throws Exception {
//		return this.userServiceImp.createUser(user, userRoles);
//	}
//
//	@GetMapping("/findUserById")
//	public ResponseEntity<ResponseStructure<User>> findUserById(@RequestParam long id) {
//		return userServiceImp.findUserById(id);
//	}
//
//	@GetMapping("/findAllUser")
//	public ResponseStructure<List<User>> findAllUser() {
//		return userServiceImp.findAllUser();
//	}
//
//	@DeleteMapping("/delete")
//	public ResponseEntity<ResponseStructure<User>> deleteUserById(@RequestParam long id) {
//		return userServiceImp.deleteUserById(id);
//	}
//	
//	@PutMapping("/update")
//	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestParam long id, @RequestBody User user, HashSet<UserRole> userRoles){
//		return userServiceImp.updateUser(id, user, userRoles) ;
//	}
}
