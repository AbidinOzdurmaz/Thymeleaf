package net.abidinozdurmaz.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import net.abidinozdurmaz.thymeleaf.service.UserService;

@Controller
public class UserController {
	
	private final UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("users",service.findAll());
		return "index";
	}
}
