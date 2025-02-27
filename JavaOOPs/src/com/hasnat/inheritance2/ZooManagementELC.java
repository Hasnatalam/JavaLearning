package com.hasnat.inheritance2;

public class ZooManagementELC {

	public static void main(String[] args) {
		
		Elephant e1 = new Elephant("ABC", 10,5.5f);
		e1.displayInfo();
		e1.displayTuskLength();
		e1.makeSound();
			
		Lion l1 = new Lion("def",10,15);
		l1.displayInfo();
		l1.displayManeLength();
		l1.makeSound();
	}

}
