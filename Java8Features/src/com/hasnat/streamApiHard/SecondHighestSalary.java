package com.hasnat.streamApiHard;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSalary {
	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		
		Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		collect.forEach((k,v)-> System.out.println(k+" : "+v));
	}
}