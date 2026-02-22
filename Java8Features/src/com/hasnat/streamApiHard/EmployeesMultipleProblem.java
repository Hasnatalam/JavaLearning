package com.hasnat.streamApiHard;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeesMultipleProblem {
	public static void main(String[] args) {
List<Employee> employees = Employee.getEmployees();
		
		Map<String, Optional<Employee>> maxByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		maxByDept.forEach((k,v)-> System.out.println(k+" : "+v));
		System.err.println("....................................................................................\n");
		
		
		Map<String, Double> deptAvgSal = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		deptAvgSal.forEach((k,v)->System.out.println(k+ " : "+v));
		System.err.println("....................................................................................\n");
		
		Map<String, Double> deptTotalSal = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
		deptTotalSal.forEach((k,v)->System.out.println(k+ " : "+v));
		System.err.println("....................................................................................\n");
		
		
		Optional<String> maxEmpdept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().stream().max(Comparator.comparing(e -> e.getValue())).map(e->e.getKey());
		maxEmpdept.ifPresent(System.out::println);
		System.err.println("....................................................................................\n");
		
		Map<String, Optional<Employee>> minAgeEmpByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy((e1,e2)->Integer.compare(e1.getAge(), e2.getAge()))));
		minAgeEmpByDept.forEach((k,v)->{System.out.print(k+" : ");v.ifPresent(System.out::println);});
		System.err.println("....................................................................................\n");
		
		Map<String, List<Employee>> seniorAndJunior = employees.stream().collect(Collectors.groupingBy(e->e.getAge()>=40?"Senior":"Junior"));
		seniorAndJunior.forEach((k,v)-> {
			System.out.println(k);
			v.forEach(System.out::println);
		});
		System.err.println("....................................................................................\n");
		
		Map<String, String> deptAndEmpName = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(e-> e.getName(), Collectors.joining(","))));
		deptAndEmpName.forEach((k,v)->System.out.println(k+" : "+v));
		System.err.println("....................................................................................\n");
		
		int n=15;
		Optional<Employee> first = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(n-1).findFirst();
		first.ifPresent(System.out::println);
		System.err.println("....................................................................................\n");
		
		
		
		
	}
}
