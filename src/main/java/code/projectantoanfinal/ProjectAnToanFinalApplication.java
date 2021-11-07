package code.projectantoanfinal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import code.projectantoanfinal.entities.Role;
import code.projectantoanfinal.entities.User;
import code.projectantoanfinal.repository.UserRepository;

@SpringBootApplication

public class ProjectAnToanFinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAnToanFinalApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		// Khi chương trình chạy
		// Insert vào csdl một user.
		User user = new User();
		user.setUsername("loda2");
		user.setPassword(passwordEncoder.encode("loda"));
		Set<Role> roles = new HashSet<>();
		roles.add(new Role(1,"USER"));
		user.setRoles(roles);
		// userRepository.save(user);
		System.out.println(user);
	}
}
