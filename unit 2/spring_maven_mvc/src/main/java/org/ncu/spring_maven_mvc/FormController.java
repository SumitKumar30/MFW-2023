package org.ncu.spring_maven_mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form") 
public class FormController {
	
	@RequestMapping("/inputForm")
	public String inputForm() {
		return "input-form";
	}
	
	/*
	 * @RequestMapping("/processForm") public String
	 * processHandler(HttpServletRequest request, Model model) { String name =
	 * request.getParameter("userName"); String roll =
	 * request.getParameter("rollNo"); String upper = name.toUpperCase(); String
	 * rollNo = "20CSU"+roll;
	 * 
	 * model.addAttribute("manipulatedName", upper);
	 * 
	 * model.addAttribute("manipulatedRollNo", rollNo);
	 * 
	 * return "process-form"; }
	 */
	
	@RequestMapping("/processForm")
	public String formHandler(@RequestParam("userName")String name, @RequestParam("userRoll")String rollNo, Model model) {
		String upper = name.toUpperCase();
		String roll = "20CSU"+rollNo;
		
		model.addAttribute("manipulatedName", upper);
		
		model.addAttribute("manipulatedRollNo", roll);
		
		return "process-form";
	}
}
