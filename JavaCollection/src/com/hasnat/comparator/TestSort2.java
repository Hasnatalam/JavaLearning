package com.hasnat.comparator;

import java.util.*;

class Students implements Comparable<Students> {
	int rollno;
	String name;
	int age;

	Students(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}



	public int compareTo(Students st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;
	}
	
}

public class TestSort2 {
	public static void main(String args[]) {
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(101, "Vijay", 23));
		al.add(new Students(106, "Ajay", 27));
		al.add(new Students(105, "Jai", 21));
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(5);
		al2.add(4);
		al2.add(7);
		al2.add(2);
		al2.add(9);
		al2.add(1);
		al2.add(4);
		al2.add(3);
		Collections.sort(al);
		
		System.out.println(al2);
		
		Collections.sort(al2);
		
		for (Students st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
	}
}
