package com.javamaster.springjpapostgres;

import com.javamaster.springjpapostgres.Entities.Address;
import com.javamaster.springjpapostgres.Entities.User;
import com.javamaster.springjpapostgres.Repos.AddressRepository;
import com.javamaster.springjpapostgres.Repos.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringjpapostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpapostgresApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsersRepository usersRepository, AddressRepository addressRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@domain.com");
				Address address = new Address(name + "'s City", name + "'s Avenue", name + "'s Building");
				user.setAddress(address);
				usersRepository.save(user);
				addressRepository.save(address);
			});

			// you ll get error if uncomment this line
			//usersRepository.findAll().forEach(System.out::println);
		};
	}

	//@Autowired
	//private UsersService userService;
	//@EventListener(ApplicationReadyEvent.class)
	/*
	@Transactional
	public void testJpaMethods(){
		Address address = new Address();
		address.setCity("Kiev");
		address.setHomeNumber("4");
		address.setStreet("Main Street");
		Address address1 = new Address();
		address1.setCity("Lviv");
		User users = new User();
		users.setAddress(address);
		users.setEmail("someEmail@gmail.com");
		users.setName("Smith");
		userService.createUsers(users);
		User users1 = new User();
		users1.setName("Jon Dorian");
		users1.setEmail("gmailEmail@gmail.com");
		users1.setAddress(address1);
		userService.createUsers(users1);

		userService.findAll().forEach(System.out::println);
		userService.findAll().forEach(System.out::println);
		userService.findWhereEmailIsGmail().forEach(System.out::println);
		userService.findWhereNameStartsFromSmith().forEach(System.out::println);
	}
	 */
}

