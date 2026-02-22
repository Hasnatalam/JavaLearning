package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,5,7,9,8);
		List<String> str = Arrays.asList("aab", "aac", "adda","bbbc");
		
		
		List<String> collect = str.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		
		long count = str.stream().filter(s-> s.startsWith("a")).count();
		System.out.println(count);
		
		List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect3);
		
		Integer integer = list.stream().max(Comparator.comparing(n->n)).get();
		System.out.println(integer);
		
		int sum = list.stream().mapToInt(n->n).sum();
		System.out.println(sum);
		
		double avg = list.stream().mapToInt(n->n).average().getAsDouble();
		System.out.println(avg);
		
		boolean anyMatch = list.stream().anyMatch(n->n%2==0);
		System.out.println(anyMatch);
		
		String collect4 = str.stream().collect(Collectors.joining(","));
		System.out.println(collect4);
		
		Integer smin = list.stream().sorted().skip(1).findFirst().orElse(0);
		System.out.println(smin);
		
		Integer smax = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		System.out.println(smax);
		
		
		
	}
}
