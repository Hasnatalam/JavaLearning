package com.hasnat.copyConstructor;

public class EmployeeELC {
	public static void main(String[] args) {
		Employee e1 = new Employee("Hasnat alam",22,120000,"devloper");
		
		Employee e2 = new Employee(e1);
		e1.raiseSalary(10);
		
		e2.raiseSalary(16);
		
		System.out.println(e1);
		System.out.println(e2);
		
	}
	
}
