//package com.hasnat.HashMapTask;
//
//import java.util.HashMap;
//
//public class FruitInventoryManagement {
//	public static void main(String[] args) {
//		HashMap<String, Integer> hm = new HashMap<>();
//		hm.put("Apple", 50);
//		hm.put("Banana", 30);
//		hm.put("Orange", 20);
//		hm.forEach((k,v)->System.out.println("Added "+k+" "+v));
//		System.out.println("Total number of entries "+hm.size());
//		if(!hm.isEmpty())  System.out.println("Hash map is not empty");
//		else  System.out.println("Hash map is empty");
//		if(hm.containsKey("Apple"))
//		System.out.println("Quantity for Apple "+hm.get("Apple"));
//		else System.out.println("Apple is not available");
//		
//		if(hm.containsKey("Banana"))
//			System.out.println("Quantity for Apple "+hm.get("Banana"));
//			else System.out.println("Banana is not available");
//		
//		if(hm.containsValue(20))
//			System.out.println("Quantity 20 exist in the records.");
//		else
//			System.out.println("Quantity 20 not exist in the records.");
//		
//		if(hm.containsValue(100))
//			System.out.println("Quantity 100 exist in the records.");
//		else
//			System.out.println("Quantity 100 not exist in the records.");
//	}
//}
