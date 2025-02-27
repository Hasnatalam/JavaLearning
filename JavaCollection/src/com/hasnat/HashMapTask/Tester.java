package com.hasnat.HashMapTask;

import java.util.HashMap;

public class Tester {
	public static void main(String[] args) {
		Student s1 = new Student(111,"Scott",19);
		Student s2 = new Student(222,"John",21);
		Student s3 = new Student(333,"Martin",20);
		Student s4 = new Student(222,"John",21);
		
		HashMap<Student,String> hm = new HashMap<>();
		hm.put(s1, "Computer");
		hm.put(s2, "Math");
		hm.put(s3, "Physics");
		hm.put(s4, "AI");
		System.out.println(hm);
	}
}