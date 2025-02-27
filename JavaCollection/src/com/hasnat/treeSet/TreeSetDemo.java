package com.hasnat.treeSet;

import java.util.SortedSet;
import java.util.TreeSet;

record Product (Integer pId,String pName,String brand,Double price) {}

public class TreeSetDemo {
	public static void main(String[] args) {
		
			SortedSet <String > ts = new TreeSet<>();
			ts.add("Element1");
			ts.add("Element2");
			ts.add("Element3");
			ts.add("Element4");
			ts.add("Element5");
			System.out.println(ts.headSet("Element3"));
			System.out.println(ts.tailSet("Element2"));
			System.out.println(ts.subSet("Element2", "Element4"));
		
		
			SortedSet <Product > ts1 = new TreeSet<>((p1,p2)->p1.pName().compareToIgnoreCase(p2.pName()));
			ts1.add(new Product(1,"iphone16","Apple",90000D));
			ts1.add(new Product(2,"S24 Ultra","Samsung",80000D));
			ts1.add(new Product(3,"S23","Samsung",45000D));
			ts1.add(new Product(4,"v24","Vivo",50000D));
			ts1.add(new Product(5,"Reno30","Oppo",40000D));
			
			
			TreeSet <Product > ts2 = new TreeSet<>(ts1);
			ts2.add(new Product(6,"iphone15ProMax","Apple",150000D));
			ts2.add(new Product(7,"S24 Ultra proMax","Samsung",130000D));

			
			System.out.println(ts2.first());
			System.out.println(ts2.last());
			
			ts2.forEach(System.out::println);
			
		
	}
}
