package com.hasnat.abstraction;

public class ShapeTester {
	public static void main(String[] args) {
		Shape s= null;
		s= new Rectangle(5,4);
		s.printDetails();
		System.out.println("Area :"+s.getArea()+"\n");
		s= new Circle(5);
		s.printDetails();
		System.out.println("Area :"+s.getArea()+"\n");
		s= new Triangle(5,4);
		s.printDetails();
		System.out.println("Area :"+s.getArea()+"\n");
	}
}
