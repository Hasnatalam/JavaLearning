package com.hasnat.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(List.of(1,2,3,4,5));
		
		list.add(List.of(10,11,12));
		list.add(List.of(6,7,8,9));
		
		List<Integer> collect = list.stream().flatMap(m->m.stream()).sorted().collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
