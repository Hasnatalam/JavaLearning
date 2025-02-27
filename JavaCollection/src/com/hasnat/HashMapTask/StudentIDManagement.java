package com.hasnat.HashMapTask;

import java.util.HashMap;
import java.util.Map;

public class StudentIDManagement {

	public static void main(String[] args) {
			Map<Integer,String> student = new HashMap<>();
			student.put(1, "Scott");
			student.put(2, "Martin");
			student.put(3, "John");
			student.put(4, "Rock");
			student.put(5, "Michel");
			student.put(6, "Smith");
			
//			for(Map.Entry s:student.entrySet()) {
//				System.out.println(student.getKey(s)+" "+student.getValue(s));
//			}
	}

}
