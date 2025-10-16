package com.hasnat.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Frequency {
	public static void main(String[] args) {
		String str = "abbrjdjs";
		
		Map<Character,Integer> freq = new LinkedHashMap<>();
		
		for(char s : str.toCharArray()) {
			freq.put(s, freq.getOrDefault(s, 0)+1);
			
		}
		List<Entry<Character, Integer>> collect = freq.entrySet().stream().filter(e-> e.getValue()==1).collect(Collectors.toList());
		
			System.out.println(collect.get(0).getKey());
		
		for(Map.Entry<Character, Integer> e : freq.entrySet()) {
			System.out.println(e);
		}
		
		
		freq.forEach((a,b)->System.out.println(a+" "+b));
		
		freq.entrySet().stream().sorted((a,b)-> b.getValue().compareTo(a.getValue())).forEach(e->System.err.println(e.getKey()+" "+e.getValue()));
	}
}
