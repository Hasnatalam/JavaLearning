package com.hasnat.streamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PerformingStreamOperatioonOnEmployee {
	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		
		
		System.err.println("\nFinding All employees");
		employees.forEach(System.out::println);
		
		System.err.println("\nPrinting no of employee");
		Long count = employees.stream().count();
		System.out.println(count);
		
		System.err.print("\nFiltering employee by gender = Male\n");
		employees.stream().filter(a->a.getGender()=="Male").forEach(n->System.out.println(n));
		
		System.err.print("\nFiltering employee by age >= 30\n");
		employees.stream().filter(a->a.getAge()>=30).forEach(n->System.out.println(n));
		
		System.err.print("\nFiltering employee by salary >=50000\n");
		employees.stream().filter(a->a.getSalary()>=50000).forEach(n->System.out.println(n));
		
		System.err.print("\nFiltering minimum salary employee\n");
		List<Employee> collect = employees.stream().sorted((a,b)->Double.compare(a.getSalary(), b.getSalary())).collect(Collectors.toList());
		System.out.println(collect.get(0));
		  Optional<Employee> minSalariedEmployee = Employee.getEmployees().stream()
	                .min(Comparator.comparingDouble(e -> e.getSalary()));
		 if(minSalariedEmployee.isPresent())System.out.println(minSalariedEmployee);
		 
		 
		 System.err.print("\nGrouping employee by gender\n");
		 Map<String, List<Employee>> employeesByGender = employees.stream()
	                .collect(Collectors.groupingBy(e -> e.getGender()));

	        // Printing grouped employees
	        employeesByGender.forEach((gender, employee) -> {
	            System.out.println("Gender: " + gender);
	            employee.forEach(System.out::println);
	        });
	        
	        System.err.print("\nCounting employee by gender\n");
	        employeesByGender.forEach((gender,employee)->{
	        	System.out.println("Gender : "+gender);
	        	System.out.println("No of employee : "+employee.stream().count());
	        });
		
	}
}
