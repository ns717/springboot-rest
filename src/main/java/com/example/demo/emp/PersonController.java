package com.example.demo.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
public class PersonController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,value="/employee")
	public void addEmployee(Employee emp) {
		service.addEmployee(emp);
	}
	
}
