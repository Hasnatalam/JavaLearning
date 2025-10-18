package com.hasnat.streamAPI;

import java.util.stream.IntStream;

public class MaxNo {
	public static void main(String[] args) {
		int arr[] = {4,2,7,9,2,1,3,6,8};
		int max = IntStream.of(arr).max().orElse(0);
		System.out.println(max);
		
	}
}
