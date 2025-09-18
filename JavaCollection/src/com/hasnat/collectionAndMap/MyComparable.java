package com.hasnat.collectionAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"Alex","cs"));
		list.add(new Student(6,"Martin","ce"));
		list.add(new Student(3,"Scott","me"));
		list.add(new Student(5,"Zaid","cs"));
		list.add(new Student(4,"Same","ee"));
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
	}
}


class Student implements Comparable<Student>{
	int id;
	String name;
	String department;
	public Student(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareToIgnoreCase(o.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}






