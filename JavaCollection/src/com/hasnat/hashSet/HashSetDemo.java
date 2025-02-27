package com.hasnat.hashSet;

import java.util.HashSet;


record Product(Integer pId,String pName,String brand,Double price) {}


public class HashSetDemo {
	public static void main(String[] args) {
		HashSet <Product > lhs = new HashSet<>();
		lhs.add(new Product(1,"iphone16","Apple",150000D));
		lhs.add(new Product(2,"S24 Ultra","Samsung",130000D));
		lhs.add(new Product(3,"S23","Samsung",135000D));
		lhs.add(new Product(4,"v24","Vivo",50000D));
		lhs.add(new Product(5,"Reno30","Oppo",40000D));
		
		lhs.forEach(list->System.out.println(list));
		
	}
}
