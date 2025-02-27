package com.hasnat.abstraction;

public class Testing {
	public static void main(String[] args) {
		Book b = new MyBook(); 
		b.setTitle("A tale of two cities");
		System.out.println("The title of my book is:"+b.getTitle());
	}
}
