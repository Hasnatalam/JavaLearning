package com.hasnat.basic1;

import java.util.Scanner;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee Id : ");
		employeeId = sc.nextInt();
		System.out.print("Enter employee Name : ");
		employeeName = sc.nextLine();
		employeeName = sc.nextLine();
		System.out.print("Enter employee Salary : ");
		employeeSalary = sc.nextDouble();
		sc.close();
	}
	public void getEmployeeData(){
		System.out.println("Employee Id is :"+employeeId);
		System.out.println("Employee Name is :"+employeeName);
		System.out.println("Employee Salary is :"+employeeSalary);
	}
}
