package com.example.demo.emp;

public class Employee {

	private String name;
	private int age;
	private int empId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
		
	public Employee(String name, int age, int empId) {
		super();
		this.name = name;
		this.age = age;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", empId=" + empId + "]";
	}	
}
