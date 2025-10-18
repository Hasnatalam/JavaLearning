package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
