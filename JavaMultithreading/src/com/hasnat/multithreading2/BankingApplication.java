package com.hasnat.multithreading2;

import java.util.Scanner;

public class BankingApplication {
	static double balance = 20000;
	public static void main(String[] args) {
		
		Object lock=new Object();
		Runnable withdraw = ()->{
			
			synchronized(lock)
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter withdraw amount");
				double withdrawAmount =sc.nextDouble();
				try {
					if(balance >= withdrawAmount) {
					balance -= withdrawAmount;
					System.out.println("You succesfully withdraw "+withdrawAmount);
				}
					else {
						throw new Exception("Insufficient Balanance");
					}
				}
				catch(Exception e) {
					System.err.println(e.getMessage());
				}
			}
			
		};
		
		Thread t1 = new Thread(withdraw);
		Thread t2 = new Thread(withdraw);
		t1.start();
		
		t2.start();
	}
}
