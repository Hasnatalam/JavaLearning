//print table of the given number (Number must be taken from Scanner class)
package com.hasnat.basic;

import java.util.Scanner;

import com.hasnat.blc_elc.PrintingTableOfGivenNumberBLC;

public class PrintingTableOfGivenNumberELC {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter which table you want to print");
		int num = sc.nextInt();
		PrintingTableOfGivenNumberBLC.printTable(num);
		sc.close();
	}

}
