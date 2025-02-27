package com.hasnat.HashMapTask;

import java.util.HashMap;

public class FruitInventoryManagement02 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm1 = new HashMap<>();
		HashMap<String, Integer> hm2 = new HashMap<>();
		
		hm1.put("Apple", 50);
		hm1.put("Banana", 30);
		hm1.put("Orange", 20);
		hm2.put("Kiwi", 40);
		System.out.println("Before merging first inventory");
		System.out.println(hm1);
		System.out.println("Before merging second inventory");
		System.out.println(hm2);
		System.out.println("After merging first inventory in second inventory");
		hm2.putAll(hm1);
		System.out.println(hm2);
		hm2.putIfAbsent("Mango", 15);
		System.out.println("After using putIfAbsent method in second inventory");
		System.out.println(hm2);
		hm2.replace("Orange", 20, 60);
		System.out.println("After replacing element in second inventory");
		System.out.println(hm2);
		hm2.remove("Kiwi");
		System.out.println("After removing kiwi from second inventory");
		System.out.println(hm2);
	}

}
