package net.abidinozdurmaz.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.abidinozdurmaz.thymeleaf.model.User;
import net.abidinozdurmaz.thymeleaf.service.UserService;

@SpringBootApplication
public class ThymeleafApp implements CommandLineRunner{

	@Autowired
	private UserService service;
	
	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApp.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		service.save(new User("Ricardo","Queresma"));
		service.save(new User("Anderson","Talisca"));
		service.save(new User("Mario","Gomez"));
		service.save(new User("Vincent","Aboubakar"));
		service.save(new User("Jose","Sosa"));
	}

}
