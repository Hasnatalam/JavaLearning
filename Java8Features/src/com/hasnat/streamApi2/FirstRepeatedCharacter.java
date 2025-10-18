package com.hasnat.streamApi2;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		String str = "Helloo";
		
		Character duplicate = str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),()->new LinkedHashMap<>(),Collectors.counting()))
		.entrySet().stream().filter(e-> e.getValue()>1).map(e-> e.getKey()).findFirst().orElse(null);
		
		System.out.println(duplicate);
		
		
	}
}
