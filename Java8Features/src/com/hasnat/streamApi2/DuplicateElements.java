package com.hasnat.streamApi2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,4,3,3,5,2,7,9,8,3,2);
		
		List<Integer> duplicates = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e-> e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
		
		System.out.println(duplicates);
	}
}
