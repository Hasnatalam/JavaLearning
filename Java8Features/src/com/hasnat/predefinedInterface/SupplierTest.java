package com.hasnat.predefinedInterface;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<String> s= ()->"Hasnat";
		System.out.println(s.get());
				
	}
}
