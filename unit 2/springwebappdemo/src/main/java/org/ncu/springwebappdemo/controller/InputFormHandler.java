package org.ncu.springwebappdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputFormHandler {
	@RequestMapping(value = "/input")
	public String getInputForm() {
		return "input-form";
	}
	
	// using HttpServletRequest to fetch the form data
	/*
	 * @RequestMapping(value = "/process") public String
	 * processInputForm(HttpServletRequest request, Model model) { String name =
	 * request.getParameter("userName"); name = "Mr. "+name.toUpperCase();
	 * System.out.println("Name: "+name); model.addAttribute("changedName", name);
	 * return "process-form"; }
	 */
	
	// Using @RequestParam to fetch the form data
	@RequestMapping(value = "/process")
	public String processInputForm(@RequestParam("userName") String name, @RequestParam("userPass") String pwd, Model model) {
		name = "Mr. "+name.toUpperCase();
		System.out.println("Name: "+name);
		pwd = pwd+"@$#301";
		model.addAttribute("changedName", name);
		model.addAttribute("changedPass", pwd);
		return "process-form";
	}
}
