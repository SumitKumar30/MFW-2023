package org.ncu.springwebappdemo.controller;

import org.ncu.springwebappdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	// create a ModelAttribute method to load the domain object/entity
	@ModelAttribute("user")
	public User getUserEntity() {
		return new User();
	}
	
	// generate or show the input form
	@RequestMapping(value = "/register")
	public String showRegistrationForm() {
		return "register-form";
	}
	
	// display the input form
	@RequestMapping(value = "/display")
	public String displayInputForm(@ModelAttribute("user") User user, Model model) {
		String name = "Mr. "+user.getUserName();
		System.out.println("User Details: "+user.toString());
		model.addAttribute("updatedName", name);
		return "display-form";
	}
}
