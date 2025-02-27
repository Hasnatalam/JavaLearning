package com.hasnat.streamLogical;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		evenSum(list);
	}
	public static void evenSum(List<Integer> list) {
		int sum = list.stream().filter(n->n%2==0).mapToInt(n->n.intValue()).sum();
		System.out.println(sum);
		
	}
}
