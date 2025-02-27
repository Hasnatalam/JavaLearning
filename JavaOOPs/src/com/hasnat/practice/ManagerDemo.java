package com.hasnat.practice;

public class ManagerDemo 
{
	public static void main(String[] args) 
	{
		Manager smith = new Manager();
		smith.setManagerData(1, "Smith", 115000);
		
		System.out.println(smith);  //calling toString() method of Manager class
	}

}
