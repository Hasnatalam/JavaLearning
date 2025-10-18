package com.hasnat.streamAPI;

import java.util.stream.IntStream;

public class Match {
	public static void main(String[] args) {
		int arr[] = {4,2,7,9,2,1,3,6,8};
		boolean even = IntStream.of(arr).anyMatch(n->n%2==0);
		boolean alleven = IntStream.of(arr).allMatch(n->n%2==0);
		boolean none = IntStream.of(arr).noneMatch(n->n<10);
		
		
		System.out.println(even);
		System.out.println(alleven);
		System.out.println(none);
		
	}
}
