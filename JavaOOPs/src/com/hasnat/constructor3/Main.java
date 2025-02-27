package com.hasnat.constructor3;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(232,"Naresh",43000);
		double salary= e1.getEmployeeSalary();
		if(salary>=60000) {
			System.out.println("Employee is devloper");
		}
		else if(salary>=40000&&salary<=60000) {
			System.out.println("Employee is designer");
		}
		else {
			System.out.println("Employee is Tester");
		}
	}

}
