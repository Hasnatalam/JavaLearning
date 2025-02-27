/*Create a Java (BLC)class named Employee with following attributes:
private String name 
private int age 
private double salary and 
private String department

Implement a parameterised constructor to initialize all the instance variable of Employee.
Implement a copy constructor for the Employee class that takes a Employee object and initialize the new Employee object with the same attributes.

Take a pair of setter and getter method for all the instance variables.
In the Employee class, create a method named raiseSalary(double percentage) that increases the salary of the employee by the specified percentage.

Create a ELC class and create Employee object and sets its attributes. 
Then, use the raiseSalary method to increase the employee's salary by 10%. Create a copy of the Employee object using the copy constructor and print the attributes of both the original and the copy of the Employee objects to confirm that the copy constructor works correctly and that the raiseSalary method did not affect the attributes of the copy of the Employee object.*/
package com.hasnat.copyConstructor;

public class Employee {
	
	private String name; 
	private int age ;
	private double salary ;
	private String department;
	public Employee(String name, int age, double salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
	
	public Employee(Employee e) {
		this.name = e.name;
		this.age =e.age;
		this.salary = e.salary;
		this.department = e.department;
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public void raiseSalary(double percentage) {
		
		salary=salary+(salary*percentage/100);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}










