package com.hasnat.streamAPI;

import java.util.stream.IntStream;

public class AverageOfNums {
	public static void main(String[] args) {
		int arr[] = {4,2,7,9,2,1,3,6,8};
		double avg = IntStream.of(arr).filter(n->n>0).average().orElse(0);
		System.out.println(avg);
		
	}
}
