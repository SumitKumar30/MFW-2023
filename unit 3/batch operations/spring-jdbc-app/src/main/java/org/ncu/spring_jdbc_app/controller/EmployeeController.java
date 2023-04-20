package org.ncu.spring_jdbc_app.controller;

import java.util.List;

import org.ncu.spring_jdbc_app.entity.Employee;
import org.ncu.spring_jdbc_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	// inject employeeService bean into EmployeeController bean	
	@Autowired
	private EmployeeService empService;
	
	// enable data binding - return entity bean
	@ModelAttribute(name = "employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
	// method to return the input form
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	//	@GetMapping(value = "/form")
	public String getEmployeeForm() {
		return "employee-form";
	}
	
	// method to process the input form
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	//	@PostMapping(value = "/process")
	public String processEmployeeForm(@ModelAttribute("employee") Employee emp) {
		/* EmployeeService empService = new EmployeeServiceImpl(); */
		if(empService.createRecord(emp) == 1)
			return "confirmation";
		else
			return "redirect:/";
	}
	
	// method to fetch all the employee records
	@RequestMapping(value = "/show")
	public String showEmployees(Model model) {
		List<Employee> employees = empService.fetchRecords();
		model.addAttribute("employees", employees);
		return "employee-list";
	}
	
	@RequestMapping(value = "/batchProcess", method = RequestMethod.POST)
	public String batchProcessOperation() {
		 List<Employee> emps = empService.fetchRecords();
		 empService.batchInsertRecord(emps);
		return "confirmation";
	}
	
}
