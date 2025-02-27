package com.hasnat.practice;

import java.util.Scanner;

public class PelindromeELC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int num = sc.nextInt();
		sc.close();
		boolean result = PelindromeBLC.isPalindrome(num);
		
		if (result) {
			System.out.println(num+" is a palindome no");
		}
		else System.out.println(num+" is not a palindome no");
	}

}
