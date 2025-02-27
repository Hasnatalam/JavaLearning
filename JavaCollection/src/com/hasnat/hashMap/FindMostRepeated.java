package com.hasnat.hashMap;

import java.util.*;

public class FindMostRepeated {
	 public static void main(String[] args) {
	        Integer numbers[] = {1, 2, 3, 3, 4, 4, 5};
	        
	        Map<Integer, Integer> map = new HashMap<>();
	        Integer max =0;
	        Integer element=0 ;
	        for (Integer key : numbers) {
	            int count=map.getOrDefault(key, 0) + 1;
	            map.put(key, count);
	            if(max<count){
	                max= count;
	                element=key;
	            }
	        }
	        
	        System.out.println(element);
	    }
}
