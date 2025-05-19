package com.hasnat.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
	public static void main(String[] args) {
		Predicate<Integer> predicate=n->n%2==0;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.forEach(n->System.out.println(predicate.test(n)));
		
		
		BiPredicate<Integer, Integer> biPredicate= (n1,n2)->n1==n2;
		list.forEach(n->System.out.println(biPredicate.test(n,n)));
	}
}
