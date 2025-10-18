package com.hasnat.streamApi2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStringLength {
	public static void main(String[] args) {
		String str = "I Love java ,java is my favourite language, Hasnat";
		
		List<String> collect = Arrays.stream(str.replaceAll("[^a-zA-Z ]", "").trim().split(" ")).sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
	
		System.out.println(collect);
	
	}
}
