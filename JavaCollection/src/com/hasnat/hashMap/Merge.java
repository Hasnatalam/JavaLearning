package com.hasnat.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Merge {
	public static void main(String[] args) {
		Map<Integer,String > map1 = new HashMap<>();
		map1.put(1, "aaa");
		map1.put(2, "aaa");
				
		
		Map<Integer,String > map2 = new HashMap<>();
		Map<Integer,String > mergedMap = new HashMap<>(map1);
		map2.put(2, "ccc");
		map2.put(3, "ddd");
		for(Entry<Integer, String> map :map2.entrySet()) {
			mergedMap.merge(map.getKey(), map.getValue(), (v1,v2)->v1+v2);
		}
		mergedMap.forEach((k,v)->System.out.println(k+" "+v));
		
	}
	
	
	
}
