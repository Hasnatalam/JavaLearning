//print all even numbers from 1 - 100
package com.hasnat.blc_elc;

import java.util.Scanner;

public class PrintEvenNoELC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number....");
		int num = sc.nextInt();
		PrintEvenNoBLC.printEven(num);
		sc.close();
		
	}

}
