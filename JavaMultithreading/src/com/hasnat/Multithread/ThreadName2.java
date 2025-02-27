package com.hasnat.Multithread;

import java.util.Scanner;

class BatchAssignment extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name!= null && name.equalsIgnoreCase("Placement")){
			System.out.println("You are from placement batch");
		}
		else if(name!= null && name.equalsIgnoreCase("Regular")){
			System.out.println("You are from regular batch");
		}
		else {
			throw new NullPointerException("Name can't be null");
		}
		
	}
}
public class ThreadName2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your batch title");
		String title = sc.next();
		BatchAssignment ba = new BatchAssignment();
		ba.start();
		ba.setName(title);
		sc.close();
	}
}
