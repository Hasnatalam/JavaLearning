package com.hasnat.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountNoOfElement {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("Mumbai","Kolkata","Banglore","Hyderabad","Delhi");
		 // count() returns a long
        Long num = list.stream().filter(str -> str.length() > 5).count();

        // Print the count
        System.out.print(num);
		
	}
}
