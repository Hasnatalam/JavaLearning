package com.hasnat.SerializationAndDeserialiazation;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public record MultipleEmployee(int empId, String empName,String city, double salary, LocalDate d)implements Serializable {
	public static MultipleEmployee getObject(Scanner sc) {
		
		
		System.out.print("Enter empid :");
		int empId = sc.nextInt();
		
		System.out.print("Enter emp Name :");
		String empName = sc.nextLine();
		empName=sc.nextLine();
		
		System.out.print("Enter emp city :");
		String city = sc.nextLine();
		
		System.out.print("Enter emp salary :");
		double salary = sc.nextDouble();
		
		LocalDate d = LocalDate.now();
		
		MultipleEmployee e = new MultipleEmployee(empId,empName,city,salary,d);
		return e;
		
	}
}
