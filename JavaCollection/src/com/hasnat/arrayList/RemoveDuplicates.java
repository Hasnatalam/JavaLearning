package com.hasnat.arrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6,2,5);
		Set <Integer> set = new HashSet<>(list);
		set.forEach(System.out::print);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println();
		collect.forEach(n-> System.out.print(n+" "));
	}
}
