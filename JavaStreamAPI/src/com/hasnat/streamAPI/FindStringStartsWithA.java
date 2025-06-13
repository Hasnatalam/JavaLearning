package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartsWithA {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Anas","aryan","alex","scott","martin");
		
		List<String> collect = students.stream()
				.filter(str -> str.substring(0,1).equalsIgnoreCase("a"))
				.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
	}
}
