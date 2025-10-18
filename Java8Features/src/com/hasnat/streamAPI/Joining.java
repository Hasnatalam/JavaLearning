package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joining {
	public static void main(String[] args) {

		String [] str = {"Alex", "Aman", "Scott", "Alex"};
		
		String collect = Arrays.stream(str).collect(Collectors.joining("."));
		
		System.out.println(collect);
	}
}
