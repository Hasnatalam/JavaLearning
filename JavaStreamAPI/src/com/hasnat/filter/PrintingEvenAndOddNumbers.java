package com.hasnat.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintingEvenAndOddNumbers {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		
		System.out.println("Even numbers : "+evenNumbers);
		System.out.print("Odd numbers : ");
		list.stream().filter(n -> n % 2 == 1).forEach(a->System.out.print(a+" "));
		
	
	}
}
