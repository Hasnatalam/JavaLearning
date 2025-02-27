package com.hasnat.lembdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class VotingEligiability {
	public static void main(String[] args) {
		
		Predicate <Integer> eligibility = age -> age >=18;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		sc.close();
		
		System.out.println("You are eligible for vote : "+eligibility.test(age));
	}
}
