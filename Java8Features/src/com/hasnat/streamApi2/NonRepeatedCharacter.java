package com.hasnat.streamApi2;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "I Love Java";
		
		Character noneRepeate = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(e-> e.getValue()==1).map(e-> e.getKey()).findFirst().orElse(null);
		
		System.out.println(noneRepeate);
	}
}
