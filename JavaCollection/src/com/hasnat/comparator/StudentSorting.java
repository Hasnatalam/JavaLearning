package com.hasnat.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

record Student(Integer roll, String name,String department) {

	
	
}


public class StudentSorting {
	public static void main(String[] args) {
		ArrayList<Student> hs = new ArrayList<>();
		
		hs.add(new Student(1,"scott", "computer"));
		hs.add(new Student(3,"Alex", "electric"));
		hs.add(new Student(2,"Lalit", "mechanical"));
		hs.add(new Student(5,"Ashwani", "electric"));
		hs.add(new Student(4,"Rupesh", "computer"));
		
		Comparator<Student> comp = (s1,s2)->s1.name().compareTo(s2.name());
	
		Collections.sort(hs,comp);
		
		hs.forEach(System.out::println);
	}
}
