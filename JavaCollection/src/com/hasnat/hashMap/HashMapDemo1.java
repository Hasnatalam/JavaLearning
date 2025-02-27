package com.hasnat.hashMap;
import java.util.*;
public class HashMapDemo1 {
	public static void main(String[] args) {
		Student s1 = new Student(1,"aaa");
		Student s2 = new Student(2,"abb");
		Student s3 = new Student(1,"aaa");
		Student s4 = s2;
		HashMap<Student,String> students = new HashMap<>();
		students.put(s1,"Hyd");
		students.put(s2,"kol");
		students.put(s3,"ban");
		students.put(s4,"pune");
		
		//students.forEach((k,v) -> System.out.println(k.id+k.name+v));
	}
	
}
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
