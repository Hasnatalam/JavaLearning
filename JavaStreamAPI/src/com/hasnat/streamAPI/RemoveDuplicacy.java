package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicacy {
	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(3,5,2,4,5,2,4,8,9,6,5,6,8);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		collect.stream().sorted().forEach(System.out::print);
		
	}
}
