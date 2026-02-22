package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Tets {
	public static void main(String[] args) {
		int [] arr = {10,11,25,11,14,13,12,12};
		
		int [] collect = Arrays.stream(arr).sorted().distinct().toArray();
		
		for(int i: collect) {
		System.out.print(i+",");
		}
		
		
		int max = Arrays.stream(arr).max().orElse(0);
		
		List<Integer> list = Arrays.asList();
		try {
		Integer maxxx = list.stream()
		                  .max(Integer::compareTo).orElseThrow();
		
		
		System.out.println(maxxx);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
