package com.hasnat.linkedList;

import java.util.LinkedList;

public class FruitsLinkedList {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Kivi");
		
		fruits.forEach(System.out::println);
		fruits.addFirst("jack fruit");
		fruits.addLast("avacado");
		System.out.println(fruits);
		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		fruits.removeFirst();
		fruits.removeLast();
		System.out.println(fruits);
		System.out.println(fruits.contains("Banana"));
	}
}
