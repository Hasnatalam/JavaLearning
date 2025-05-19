package com.hasnat.revige;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		
		
		String word="Hasnat";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<word.length();i++) {
			map.put(word.charAt(i), map.getOrDefault(word.charAt(i),0)+1) ;
		}
		map.forEach((k,v)->System.out.println(k.charValue()+" "+v.intValue()));
		
	}
}
