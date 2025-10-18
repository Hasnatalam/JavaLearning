package com.hasnat.streamAPI;

import java.util.stream.IntStream;

public class EvenFromArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		int[] array = IntStream.of(arr).filter(n-> n%2==0).toArray();
		
		for(int n : array) {
			System.out.println(n);
		}
	}
}
