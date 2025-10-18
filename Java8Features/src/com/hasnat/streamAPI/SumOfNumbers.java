package com.hasnat.streamAPI;

import java.util.stream.IntStream;

public class SumOfNumbers {
	public static void main(String[] args) {
		int arr[] = {4,2,7,9,2,1,3,6,8};
		int sum = IntStream.of(arr).filter(n->n%2==0).sum();
		System.out.println(sum);
		
	}
}
