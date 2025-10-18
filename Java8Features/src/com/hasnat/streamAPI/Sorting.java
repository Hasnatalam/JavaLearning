package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		int arr[] = {4,2,7,9,2,1,3,6,8};
		
		List<Integer> collect = Arrays.stream(arr).boxed().sorted(Comparator.comparing(e->e)).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
