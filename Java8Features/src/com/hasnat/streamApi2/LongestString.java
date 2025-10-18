package com.hasnat.streamApi2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {
	public static void main(String[] args) {
		String str = "I Love java ,java is my favourite language, Hasnat";
		
		String longest = Arrays.stream(str.replaceAll("[^a-zA-Z ]", "").trim().split(" ")).sorted(Comparator.comparing(String::length).reversed()).findFirst().orElse(null);
		
		List<String> threeLongest = Arrays.stream(str.replaceAll("[^a-zA-Z ]", "").trim().split(" ")).sorted(Comparator.comparing(String::length).reversed()).limit(3).collect(Collectors.toList());;
		
		System.out.println(longest);
		System.out.println(threeLongest);
	}
}
