package com.hasnat.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDuplicate {
	public static void main(String[] args) {
		Integer arr [] = {1,2,3,3,4,5,6,4,5,7,7,8,9};
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		
		System.out.println("No Of Dupicate : "+ (arr.length-set.size()));
		
	}
}
