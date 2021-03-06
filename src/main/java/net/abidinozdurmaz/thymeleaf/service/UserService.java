package net.abidinozdurmaz.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.abidinozdurmaz.thymeleaf.model.User;
import net.abidinozdurmaz.thymeleaf.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
		
	
	public List<User> findAll(){
		
		return userRepository.findAll();
		
	}
	
	public User save(User user){
		return userRepository.save(user);
	}
}
