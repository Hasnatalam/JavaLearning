package com.hasnat.basic1;

public class DogELC {

	public static void main(String[] args) {
		Dog toni = new Dog();
		
		toni.name = "Toni";
		toni.age = 5;
		toni.height = 70;
		
		toni.getDogInformation();
		toni.bark();
	}

}
