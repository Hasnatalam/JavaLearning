package com.hasnat.cosntructer2;

public class EmployeeELC2 {

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2(1,"Hasnat",90000);
		
		double salary = e1.getEmployeeSalary();
		
		if(salary == 90000) {
			System.out.println("Employee is devloper.");
		}
		else if(salary == 60000) {
			System.out.println("Employee is designer.");
		}
		else if(salary == 40000) {
			System.out.println("Employee is tester.");
		}
		else System.out.println("Enter a valid salary");
	}
	
}
