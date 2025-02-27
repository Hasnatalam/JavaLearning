package com.hasnat.basic1;

public class Actor {
	String name;
	String industry;
	String lastMovie;
	int age;
	int totalFilms;
	String profession;
	
	public void bioData() {
		System.out.println("Name       : "+name);
		System.out.println("Age        : "+age);
		System.out.println("Profession : "+profession);
	}
	
	public void career() {
		System.out.println("Total Movies : "+totalFilms);
		System.out.println("Last movie   : "+lastMovie);
	}
}
