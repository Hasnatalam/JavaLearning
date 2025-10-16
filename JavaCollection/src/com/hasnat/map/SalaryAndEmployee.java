package com.hasnat.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
public class SalaryAndEmployee {
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee(1,"Alex",65000),
				new Employee(2,"Alex",55000),
				new Employee(3,"Alex",45000),
				new Employee(4,"Alex",60000)
				);		
		
		
		Map<Double, Employee> emps = employees.stream().collect(Collectors.toMap(emp -> emp.getSalary(), emp -> emp));
		
		emps.forEach((k,v) -> System.out.println(k+" : "+v));
		
	}
}

class Employee {
	int id;
	String name;
	double salary;
	Employee(){}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)return true;
		if(this.getClass() != obj.getClass() || obj==null) return false;
		Employee s = new Employee();
		if(obj instanceof Employee) {
			s = (Employee) obj;
		}
		return this.id == s.id && this.name.equalsIgnoreCase(s.name) && this.salary == s.salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id+name+salary);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}