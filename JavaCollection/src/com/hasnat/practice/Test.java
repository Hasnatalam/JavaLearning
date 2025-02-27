package com.hasnat.practice;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>(100,10);
		v.add("red");
		v.add("white");
		v.add("blue");
		v.add("green");
		v.add("yellow");
		
		System.out.println(v.capacity());
		System.out.println(v);
		
		
	}
}
