package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetAndSkipFirstNElements {
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> collect = Arrays.stream(arr).limit(5).boxed().collect(Collectors.toList());
		
		System.out.println(collect);
		
		List<Integer> collect2 = IntStream.of(arr).boxed().skip(3).collect(Collectors.toList());
		
		System.out.println(collect2);
	}
	
}
