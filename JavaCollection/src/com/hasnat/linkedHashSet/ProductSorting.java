package com.hasnat.linkedHashSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

record Product (Integer pId,String pName,String brand,Double price) {}


public class ProductSorting {

	public static void main(String[] args) {
		LinkedHashSet <Product > lhs = new LinkedHashSet<>();
		lhs.add(new Product(1,"iphone16","Apple",150000D));
		lhs.add(new Product(2,"S24 Ultra","Samsung",130000D));
		lhs.add(new Product(3,"S23","Samsung",135000D));
		lhs.add(new Product(4,"v24","Vivo",50000D));
		lhs.add(new Product(5,"Reno30","Oppo",40000D));
		
		
		LinkedList <Product> list = new LinkedList<>();
		list.add(new Product(1,"iPhone16","Apple",150000D));
		list.add(new Product(2,"S24 Ultra","Samsung",130000D));
		list.add(new Product(3,"S23","Samsung",135000D));
		list.add(new Product(4,"V24","Vivo",50000D));
		list.add(new Product(5,"Reno30","Oppo",40000D));
		
		//Using Comparator
		
		Comparator<Product> comp =(p1,p2)->p1.brand().compareToIgnoreCase(p2.brand());
		Collections.sort(list,comp);
		
		
		lhs.forEach(System.out::println);
		System.out.println("\n\n\n");
		list.forEach(System.out::println);
	}
}
