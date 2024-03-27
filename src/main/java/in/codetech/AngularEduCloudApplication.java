package in.codetech;

import java.util.HashSet;

import java.util.Set;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.codetech.model.Role;
import in.codetech.model.User;
import in.codetech.model.UserRole;
import in.codetech.service.UserService;
import in.codetech.service.UserServiceImp;

@SpringBootApplication
public class AngularEduCloudApplication implements CommandLineRunner{
	@Autowired
	private UserService userService;

	public static void main(String[] args) throws Exception {		
		ConfigurableApplicationContext applicationContext  =SpringApplication.run(AngularEduCloudApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Code Start....!!!");
		User user = new User();

		user.setId(3l);
		user.setFirstName("Virat");
		user.setLastName("Kohli");
		user.setEmail("Virat45@");
		user.setpNumber(9325303716l);
		user.setUserName("virat18");
		user.setPassword("18");
		user.setEnable(true);
		user.setProfile("PNG");

		Role role = new Role();
		role.setRoleId(1l);
		role.setRole("Admin");

		Set<UserRole> userRoles = new HashSet<>();

		UserRole userRole = new UserRole();
		userRole.setUserRoleID(3l);
		userRole.setUser(user);
		userRole.setRole(role);

		userRoles.add(userRole);
//		System.out.println(userRoles);

		User user1 = this.userService.createUser(user, userRoles) ;
		System.out.println(user1.getUserName());		
	}

}
