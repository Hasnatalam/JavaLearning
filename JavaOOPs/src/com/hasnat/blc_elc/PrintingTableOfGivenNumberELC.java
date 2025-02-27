package com.hasnat.blc_elc;

import java.util.Scanner;

public class PrintingTableOfGivenNumberELC {
	public static void main(String[] args) {
	
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no which table you want to print");
		num = sc.nextInt();
		PrintingTableOfGivenNumberBLC.printTable(num);
		sc.close();
	}
}
