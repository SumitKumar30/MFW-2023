package org.ncu.spring_maven_mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userControl")
public class UserController {
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
		
	}
	
	@RequestMapping("/display")
	public String showForm() {
		return "display";
	}
	
	@RequestMapping("/process")
	public String processForm(@Valid @ModelAttribute("user")User user, BindingResult bindingResult) {
		
		System.out.println("User Name: "+user.getUserName()+" Roll No>: "+user.getRollNo()+" Password: "+user.getPassword());
		
		if(bindingResult.hasErrors()) {
			return "display";
		}else {
			return "Confirmation";
		}
		
		
	}
}
