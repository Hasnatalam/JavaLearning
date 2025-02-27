package com.hasnat.HashMapTask;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashSetDemo {
	public static  void compareIterationOrder(HashMap<Integer, String> obj) {
		obj.put(1, "One");
		obj.put(3, "Three");
		obj.put(4, "Four");
		obj.put(17, "Seventeen");
		obj.put(19, "Ninteen");
		obj.put(13, "Thirteen");
		System.out.println(obj);
	}
	public static void main(String[] args) {
		HashMap <Integer,String>hm= new HashMap<>();
		compareIterationOrder(hm);
		HashMap<Integer,String> lhm = new LinkedHashMap<>();
		compareIterationOrder(lhm);
	}
}
