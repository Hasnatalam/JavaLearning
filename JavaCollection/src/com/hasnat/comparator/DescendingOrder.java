package com.hasnat.comparator;

import java.util.ArrayList;

public class DescendingOrder {

	public static void main(String[] args) 
	{
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(99);
		listOfNumbers.add(89);
		listOfNumbers.add(15);
		listOfNumbers.add(88);
		listOfNumbers.add(9);
		listOfNumbers.add(2);
		
		listOfNumbers.sort((i1,i2)-> i1.compareTo(i2));
		
		listOfNumbers.forEach(num -> System.out.println(num));
		
	}
}
