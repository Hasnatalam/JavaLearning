package com.hasnat.Multithread;

class Stuff extends Thread {
	
	@Override
	public void run() {
		System.out.println("Child thread is running!!!");
	}
}
public class ExceptionDemo {
	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Main thread is started");
		Stuff s1 = new Stuff ();
		Stuff s2 = new Stuff ();
		s1.start();
		Thread.sleep(5000);
		s2.start();
		System.out.println("Thread s2 is alive"+s2.isAlive());
		
		System.out.println(10/0);
		System.out.println("Main thread is ended");
		
	}
}
