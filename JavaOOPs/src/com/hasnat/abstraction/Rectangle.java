package com.hasnat.abstraction;

public class Rectangle extends Shape{
	
	double length;
	double breadth;
	

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		double area=length*breadth;
		return area;
	}

	@Override
	public void printDetails() {
		System.out.println("Type : Rectanle");
		System.out.println("Length :"+length);
		System.out.println("Breadth :"+breadth);
	}

	

}
