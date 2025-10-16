package com.hasnat.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfNames {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Harry","Hasib","Alex","Aman","Amir","Scott");
		
		Map<Character, List<String>> group = new HashMap<>();
		
		for(String name : names) {
			group.putIfAbsent(name.charAt(0), new ArrayList<String>());
			
			group.get(name.charAt(0)).add(name);
		}
		
		//group.forEach((k,v)->System.out.println(k+ " " + v));
		
		
		group.clear();
		group = names.stream().collect(Collectors.groupingBy(name -> Character.toUpperCase(name.charAt(0))));
		
		group.forEach((k,v)->System.out.println(k+ " " + v));
	}
}
