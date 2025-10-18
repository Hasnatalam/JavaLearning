package com.hasnat.streamApi2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,5,2,7,9,8,3,2);	
		
		
		Integer secondHighest = list.stream()
			    .sorted(Comparator.reverseOrder())
			    .skip(1)
			    .findFirst()
			    .orElse(null);

		
		System.out.println(secondHighest);
	}
}
