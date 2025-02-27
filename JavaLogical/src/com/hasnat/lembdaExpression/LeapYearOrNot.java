package com.hasnat.lembdaExpression;

import java.util.function.Predicate;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Predicate <Integer> year = y -> (y%4==0&&y%100!=0)||y%400==0;
		
		int ye=1800;
		
		System.out.println(ye+" is a Leap year : "+year.test(ye));
	}

}
