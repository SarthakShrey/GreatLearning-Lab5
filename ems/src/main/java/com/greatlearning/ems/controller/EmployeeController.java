package com.greatlearning.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/list")
	public String listEmployees(Model theModel) {
		
		//get employees details from DB
		List<Employee> employees = employeeServices.findAll();
		
		//add to the model
		theModel.addAttribute("employees", employees);
		
		return "employees/list-employees";
		
	}
	
	//step1
	//show form - employee-form.html for saving employee details
	@RequestMapping("/showEmployeeForm_Save")
	public String saveEmployee_Step1(Model theModel) {
	
		//create model attribute
		Employee employee = new Employee();
		
		theModel.addAttribute("employee", employee);
		
		return "employees/employee-form";
		
	//step2
	//save the employee details in DB
	//save(...)
	@PostMapping("/save")
	
	public String saveEmployee(
			@ModelAttribute("employee") Employee employee) {
		
		//save the employee
		employeeService.save(employee);
		
		//redirrect to listing page
		return "redirect:/employees/list";
	}
	

}
