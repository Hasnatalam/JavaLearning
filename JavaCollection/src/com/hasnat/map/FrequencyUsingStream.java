package com.hasnat.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyUsingStream {
	public static void main(String[] args) {
		List<String> city = Arrays.asList("hyderabad","Bengalore","Kolkata","Mumbai","Delhi","Kolkata","Hyderabad");
		
		Map<String, List<String>> collect = city.stream().collect(Collectors.groupingBy(name-> Character.toUpperCase(name.charAt(0))+name.substring(1)));
		
		collect.forEach((k,v) -> System.out.println(k+" : "+v.size()));
		
		for(Map.Entry<String, List<String>> map : collect.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}
}
