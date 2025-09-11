package com.hasnat.lambdaExpressionAndFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllPredefinedFuntionalInterface {
	public static void main(String[] args) {
		Predicate<Integer> p = a-> a%10==0;
		System.out.println(p.test(10));
		BiPredicate<Integer,Integer> bp = (a,b) -> a==b;
		System.out.println(bp.test(10,15));
		
		Function<Integer,String> f = a -> a+"number";
		System.out.println(f.apply(15));
		BiFunction<Integer,Integer,String> bf = (a,b) -> a+b+"number";
		System.out.println(bf.apply(10,15));
		
		Supplier<String> s = () -> "Hello";
		System.out.println(s.get());
		Consumer<Integer> c = a->System.out.println(a);
		c.accept(10);
	}
}
