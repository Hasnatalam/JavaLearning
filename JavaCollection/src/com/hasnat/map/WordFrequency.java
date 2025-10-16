package com.hasnat.map;

import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {
	public static void main(String[] args) {
		String sentance = "There is many programming Language I love java java is a secured language";
		String words [] = sentance.split(" ");
		
		Map<String,Integer> freq = new TreeMap<>((a,b)-> a.compareToIgnoreCase(b));
		
		for(String str : words) {
			freq.put(str, freq.getOrDefault(str, 0)+1);
		}
		
		freq.forEach((a,b)->System.out.println(a+" "+b));
	}
}
