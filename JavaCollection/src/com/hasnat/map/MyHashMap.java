package com.hasnat.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Element1", 1);
		map.put("Element2", 2);
		map.put("Element3", 3);
		map.put("Element4", 4);
		map.put("Element5", 5);
		map.put("Element6", 6);
		map.put("Element7", 7);
		map.put("Element8", 8);
		map.put("Element9", 9);
		
		//1
		map.forEach((k,v)-> {if(v>5)System.out.println(k+" : "+v);});
		
		
		map.remove("Element2");
		
		Map<String,Integer> map2 = Map.of("ee1", 1, "ee2", 2);
		map.putAll(map2);
		
		
		//2
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.err.println(m.getKey()+" : "+ m.getValue());
		}
		
		
		for(String s : map.keySet()) {
			System.out.println(s+" : "+map.get(s));
		}
		
		for(Integer v : map.values()) {
			System.out.println(v);
		}
		
		Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next().getKey();
		System.out.println(key + " : "+ map.get(key));
		}
	}
}
