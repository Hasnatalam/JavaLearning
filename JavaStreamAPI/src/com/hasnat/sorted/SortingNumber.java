package com.hasnat.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortingNumber {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,6,4,2,5,3);
		
		System.out.println("Using strem()");
		list.stream().sorted().forEach(System.out::print);
		
		System.out.println("\nUsing strem.of()");
		Stream<Integer> st = Stream.of(1,2,6,4,2,5,3);
		st.sorted().forEach(System.out::print);
				
	}
}
