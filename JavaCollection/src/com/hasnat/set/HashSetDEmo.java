package com.hasnat.set;

import java.util.HashSet;

public class HashSetDEmo {
	public static void main(String[] args) {
		HashSet <String> hs = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>(20);
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs2.add("aaa");
		hs2.addAll(hs);
		
		hs.forEach(str->System.out.println(str));
		//hs2.forEach(str->System.out.println(str));
	}
}
