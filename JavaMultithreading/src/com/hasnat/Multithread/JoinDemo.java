package com.hasnat.Multithread;

class Join extends Thread{
	@Override 
	public void run() {
		
		for(int i=1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i value is "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
			
			
		
	}
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Join j1 = new Join();
		j1.setName("J1 Thread");
		Join j2 = new Join();
		j2.setName("J2 Thread");
		Join j3 = new Join();
		j3.setName("J3 Thread");
		j1.start();
		j1.join();
		
		System.out.println("Thread j2 and j3 yet to start");
		j2.start();
		j3.start();
		
		
		
	}
}
