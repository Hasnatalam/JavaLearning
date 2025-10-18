package com.hasnat.streamApi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(5,6,7,8,9,1);
		
		List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
	
		System.out.println(collect);
		
	}
}
