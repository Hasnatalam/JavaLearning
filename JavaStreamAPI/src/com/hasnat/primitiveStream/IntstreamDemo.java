package com.hasnat.primitiveStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntstreamDemo {
	public static void main(String[] args) throws InterruptedException {
		int arr1[]= new int[]{1,2,3,4,5};
		int arr2[]= new int[]{6,7,8,9,10,};
		int arr3[]= new int[]{11,12,13,14,15};
		
		List<int[]> list= Arrays.asList(arr1,arr2,arr3);
		
		IntStream flatMapToInt = list.stream().flatMapToInt(array->Arrays.stream(array));
		flatMapToInt.forEach(n->System.out.print(n+" "));
		//we can't do this because flatMaptoInt closed after once used
		//flatMapToInt.filter(n->n>10).forEach(n->System.out.print(n+" "));
		System.out.println("\nFiltering list of int < 10");
		list.stream().flatMapToInt(Arrays::stream).filter(n->n<10).forEach(p->System.out.print(p+" "));
	}
}
