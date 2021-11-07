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
import code.projectantoanfinal.repository.RoleRepository;

@SpringBootApplication
public class ProjectAnToanFinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAnToanFinalApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
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
//		userRepository.save(user);
//		roleRepository.save(new Role(1,"USER"));
		System.out.println(user);
	}

//	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
//			"classpath:/META-INF/resources/", "classpath:/resources/",
//			"classpath:/static/", "classpath:/public/" };
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/**")
//				.addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
//	}
	
}
