package net.abidinozdurmaz.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.abidinozdurmaz.thymeleaf.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
