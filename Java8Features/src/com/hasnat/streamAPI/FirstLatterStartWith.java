package com.hasnat.streamAPI;

import java.util.Arrays;

public class FirstLatterStartWith {
	public static void main(String[] args) {
		String [] str = {"Alex", "Aman", "Scott", "Martin"};
		
		long count = Arrays.stream(str).filter(s-> s.toLowerCase().startsWith("a")).count();
		System.out.println(count);
	}
}
