package com.example.demo.emp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<Employee> listOfEmployees = Arrays.asList(
			new Employee("Nitin",30,1),
			new Employee("Birendra",28,2),
			new Employee("Richa",28,3)
			);
	
	public List<Employee> getAllEmployee() {
		return listOfEmployees;
	}

	public Employee getEmployee(int id) {		
		return listOfEmployees.stream().filter(emp->emp.getEmpId()==id).findFirst().get();
	}

	public void addEmployee(Employee emp) {
		listOfEmployees.add(emp);
	}
}
