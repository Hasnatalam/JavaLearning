package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45,432,67,3,46,8,6745,42,5,3,23,1256);
		list.stream().sorted().forEach(System.out::println);
		
//		List<String> names = Arrays.asList("scott", "alex", "martin");
//		names.stream().map(Students::new).collect(Collectors.toList());
		
		 List<Student> students= Arrays.asList(
				 new Student(1,"scott"), new Student(3,"alex"),new Student(2,"martin")
				 );
		 
		 List<Student> collect = students.stream()
				    .sorted(Comparator.comparing(Student::getName).reversed())
				    .collect(Collectors.toList());

		 
		 List<Student> collect2 = students.stream()
				    .sorted(Comparator.comparing(student -> ((Student) student).getRoll()))
				    .collect(Collectors.toList());
		 
		 
		 collect.forEach(System.out::println);
		 collect2.forEach(System.out::println);
		 
	}
}


class Student{
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll= roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	protected int getRoll() {
		return roll;
	}

	protected void setRoll(int roll) {
		this.roll = roll;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	
}
