package com.hasnat.flatMap;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    	
    	List<String> fruits = Arrays.asList("Apple", "Mango", "Kiwi");
    	List<String> color = Arrays.asList("red", "black", "white");
        // Step 1: Create a map of fruits and their prices
        List<List<String>> nestedList =List.of(fruits,color);
        
      List<String> flatList = nestedList.stream().flatMap(list->list.stream()).collect(Collectors.toList());
      System.out.println(flatList);
    }
}
