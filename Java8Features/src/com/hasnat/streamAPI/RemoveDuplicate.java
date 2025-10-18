package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String [] str = {"Alex", "Aman", "Scott", "Alex"};
		List<String> collect = Arrays.stream(str).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
