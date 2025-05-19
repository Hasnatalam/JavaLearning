package com.hasnat.functionalInterface;

import java.util.function.Supplier;

public class Mysupplier {
	public static void main(String[] args) {
		Supplier<Integer> printNo = ()-> 4*5;
		System.out.println(printNo.get());
	}
}
