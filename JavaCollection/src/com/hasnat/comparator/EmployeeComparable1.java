package com.hasnat.comparator;
import java.util.ArrayList;
import java.util.Collections;
 record Employee1(Integer employeeId, String employeeName) {}





public class EmployeeComparable1 {

	public static void main(String[] args) 
	{
		ArrayList<Employee1> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee1(222, "Raj"));
		listOfEmployees.add(new Employee1(333, "Aryan"));
		listOfEmployees.add(new Employee1(111, "Zuber"));
		
		//Sorting the Employee based on the ID
		listOfEmployees.sort((s1,s2)->s1.employeeName().compareTo(s2.employeeName()));
		
		listOfEmployees.forEach(System.out::println);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		Collections.sort(list);
	}

}
