package com.hasnat.predefinedInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	int a=10,b=20;
	Predicate<Integer> p = n->n>10;
	
	System.out.println(p.test(a));
	
	BiPredicate<Integer,Integer> p1 = (n1,n2)->n1<=n2;
	System.out.println(p1.test(a,b));
}
}
