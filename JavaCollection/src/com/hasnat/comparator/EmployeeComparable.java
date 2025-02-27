package com.hasnat.comparator;
import java.util.ArrayList;
import java.util.Collections;
 record Employee(Integer employeeId, String employeeName) implements Comparable<Employee>
{
	@Override
	public int compareTo(Employee e2) 
	{
		return this.employeeId.compareTo(e2.employeeId);
	}

	
}





public class EmployeeComparable {

	public static void main(String[] args) 
	{
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(222, "Raj"));
		listOfEmployees.add(new Employee(333, "Aryan"));
		listOfEmployees.add(new Employee(111, "Zuber"));
		
		//Sorting the Employee based on the ID
		Collections.sort(listOfEmployees);
		
		listOfEmployees.forEach(System.out::println);

	}

}
