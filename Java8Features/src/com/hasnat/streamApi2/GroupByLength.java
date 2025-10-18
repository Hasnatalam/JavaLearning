package com.hasnat.streamApi2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
	
	public static void main(String[] args) {
		String str = "I Love java ,java is my favourite language, Hasnat";
		
		Map<Integer, List<String>> grouped = Arrays.stream(str.replaceAll("[^a-zA-Z ]", "").split("\\s+")).collect(Collectors.groupingBy(s->s.length()));
		
		
		grouped.forEach((k,v)->
		System.out.println(k+" "+v));
		
	}
}
