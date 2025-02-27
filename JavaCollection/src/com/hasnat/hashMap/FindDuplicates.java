package com.hasnat.hashMap;

import java.util.*;

public class FindDuplicates {
	public static void main(String[] args) {
        Integer numbers[] = {1, 2, 3, 4, 2, 5, 6, 7, 1};
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (Integer key : numbers) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Corrected lambda expression with a block
        map.forEach((k, v) -> {if (v == 2) System.out.println(k + " occurs " + v + " times");});
    }
}
