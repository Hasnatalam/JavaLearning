package com.hasnat.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethodDemo {
	public static void main(String[] args) {
		List<Integer> primeNumbers = Arrays.asList(5,7,11);
	    List<Integer> evenNumbers = Arrays.asList(2,4,6);
	    List<Integer> oddNumbers = Arrays.asList(1,3,5);
	    
	    List<List<Integer>> nestedList= List.of(primeNumbers,evenNumbers,oddNumbers);
	    System.out.println(nestedList);
	    
	    nestedList.stream().flatMap(n-> n.stream()).forEach(l->System.out.print(l+" "));
	    
	    List<Integer> collect = nestedList.stream().flatMap(n-> n.stream()).collect(Collectors.toList());
	    System.out.println("\n"+collect);
	    
	}
}
