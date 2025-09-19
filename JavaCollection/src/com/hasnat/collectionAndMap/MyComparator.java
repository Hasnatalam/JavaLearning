package com.hasnat.collectionAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparator {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Alex",45000));
		list.add(new Employee(2,"Scott",20000));
		list.add(new Employee(3,"Martin",45000));
		list.add(new Employee(4,"Rock",30000));
		
		Collections.sort(list,(a,b)->a.name.compareTo(b.name));
		list.sort((a,b)->a.name.compareTo(b.name));
		list.sort((a,b)->a.salary-b.salary);
		
		list.forEach(System.out::println);
	}
}

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}