//print the sum of first hundred natural number
package com.hasnat.blc_elc;

import java.util.Scanner;

public class SumOfNaturalNumberELC {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		String sumOfNatural = SumOfNaturalNumberBLC.sumOfNaturalNumber(num);
		
		System.out.println(sumOfNatural);
		sc.close();
	}

}
