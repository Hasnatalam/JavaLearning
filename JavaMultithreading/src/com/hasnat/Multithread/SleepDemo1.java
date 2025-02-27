package com.hasnat.Multithread;

class Doo extends Thread{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("Child Id is "+thread.getId());
		for(int i=1;i<=5;i++) {
			System.out.println("i value is "+i);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class SleepDemo1 {

	public static void main(String[] args) throws Exception{
		Thread thread = Thread.currentThread();
		System.out.println("Id of main Thread  "+thread.getId());
		Doo d1 = new Doo();
		Doo d2 = new Doo();
		d1.start();
		//Thread.sleep(3000);
		d2.start();
		
		
	}

}
