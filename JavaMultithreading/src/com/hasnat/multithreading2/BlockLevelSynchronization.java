package com.hasnat.multithreading2;
class ThreadName{
	public void PrintThreadName() {
		String name=Thread.currentThread().getName();
		System.out.println("Current thread is "+name);
		
		synchronized(this){
			for(int i =1;i<10;i++) {
				System.out.println("i value is "+i+" by Thread name :"+name);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
public class BlockLevelSynchronization {
	public static void main(String[] args) {
		ThreadName lock = new ThreadName();
		Runnable r1 = ()-> lock.PrintThreadName();
		Thread t1 = new Thread(r1,"Child1");
		Thread t2 = new Thread(r1,"Child2");
		t1.start();
		t2.start();
		
	}
}
