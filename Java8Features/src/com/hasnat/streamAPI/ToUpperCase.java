package com.hasnat.streamAPI;

import java.util.Arrays;

public class ToUpperCase {
	public static void main(String[] args) {
		String [] str = {"java", "is", "a", "programming", "language"};
		
		Arrays.stream(str).map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
	}
}
