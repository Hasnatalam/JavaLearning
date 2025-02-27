package com.hasnat.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 6, 4, 2, 5, 3);

		System.out.println("Using strem()");
		List<Integer> collect = list.stream().sorted().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
