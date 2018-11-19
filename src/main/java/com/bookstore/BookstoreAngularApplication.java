package com.bookstore;

//import java.util.HashSet;
//import java.util.Set;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.bookstore.config.SecurityUtility;
//import com.bookstore.domain.User;
//import com.bookstore.domain.security.Role;
//import com.bookstore.domain.security.UserRole;
//import com.bookstore.service.UserService;

@SpringBootApplication
public class BookstoreAngularApplication /* implements CommandLineRunner  */ {

//	@Autowired
//	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAngularApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Set<UserRole> userRoles1 = new HashSet<>();
//
//		User user1 = new User();
//		user1.setFirstName("Admin");
//		user1.setLastName("Admin");
//		user1.setUsername("admin");
//		user1.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
//		user1.setEmail("Admin@gmail.com");
//		Role role1 = new Role();
//		role1.setRoleId(0);
//		role1.setName("ROLE_ADMIN");
//		userRoles1.add(new UserRole(user1, role1));
//		try {
//			user1 = userService.createUser(user1, userRoles1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		userRoles1.clear();
//		
//		Set<UserRole> userRoles2 = new HashSet<>();
//		User user2 = new User();
//		user2.setFirstName("John");
//		user2.setLastName("Adams");
//		user2.setUsername("j");
//		user2.setPassword(SecurityUtility.passwordEncoder().encode("p"));
//		user2.setEmail("JAdams@gmail.com");
////		Role role2 = new Role();
//		role1.setRoleId(1);
//		role1.setName("ROLE_USER");
//		userRoles2.add(new UserRole(user2, role1));
//
//		try {
//			user2 = userService.createUser(user2, userRoles2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		userRoles2.clear();
//
//	}
}
