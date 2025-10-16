package com.hasnat.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListOfKeys {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("element1", 1);
		map.put("element2", 4);
		map.put("element3", 7);
		map.put("rlement4", 8);
		map.put("element5", 9);
		map.put("element6", 2);
		map.put("element7", 3);
		
		
		List<String> collect = map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue())).map(e-> e.getKey()).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		List<String> collect2 = map.entrySet().stream().filter(value -> value.getKey().startsWith("e")).map(value -> value.getKey()).collect(Collectors.toList());
		
		collect2.forEach(System.err::println);
	}
}
