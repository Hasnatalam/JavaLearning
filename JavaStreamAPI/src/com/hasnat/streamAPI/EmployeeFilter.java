package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private Double salary;
	private String Department;
	public Employee(String name, Double salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		Department = department;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected Double getSalary() {
		return salary;
	}
	protected void setSalary(Double salary) {
		this.salary = salary;
	}
	protected String getDepartment() {
		return Department;
	}
	protected void setDepartment(String department) {
		Department = department;
	}
	
	
	
}
public class EmployeeFilter {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("scott",55000d,"It"),
				new Employee("alex",60000d,"It"),
				new Employee("martin",70000d,"finance"),
				new Employee("rahul",40000d,"It"),
				new Employee("john",80000d,"It")
				);
		List<Employee> collect = list.stream()
		.filter(student->student.getSalary()>50000&&student.getDepartment()
				.equalsIgnoreCase("it")).collect(Collectors.toList());
		collect.forEach(student-> System.out.println(student.getName()));
	}
}