package com.hasnat.streamAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToUpperCase {
	public static void main(String[] args) {
		List<String> list = List.of("hyderabad","mumbai","kolkata","hyderabad");
		Set<String> cityInUpperCase = list.stream().map(str-> str.toUpperCase()).collect(Collectors.toSet());
		
		cityInUpperCase.forEach(System.out::println);
		
	}
}
