package com.hasnat.streamApi2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionByEvenAndOdd {
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7,8,9};
		
		Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n-> n%2==0));
		
		Map<String, List<Integer>> collect2 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n%2==0?"Even" : "odd"));
	
		System.out.println(collect);
	
		
		collect2.forEach((k,v)->System.out.println(k+" : "+v));
	}
}
