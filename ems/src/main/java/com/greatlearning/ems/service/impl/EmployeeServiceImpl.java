package com.greatlearning.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereitype.Services;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.repository.EmployeeRepository;
import com.greatlearning.ems.service.EmployeeService;
import com.greatlearning.ems.service.EmployeeServices;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	@Overide
	public List<Employee> findAll() {
		
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}
	
	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
		
	}
	
	@Override
	public Employee findById(Integer employeeID) {
		return employeeRepository.findById(employeeID).get();
		
	}
	
	@Override 
	public void deleteById(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
		
		
	}
	//step1 {
	
	//show form - employee-form.html for saving employee details
	
	
	
	//step2
	//save the employee details in DB
	//save(...)
	
}
