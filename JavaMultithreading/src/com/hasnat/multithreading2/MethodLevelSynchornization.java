package com.hasnat.multithreading2;
class Table {
	public synchronized void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+num+" : "+i*num);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Sleep method Interrupted");
		}
		}
		System.out.println("-----------");
	}
}
public class MethodLevelSynchornization {

	public static void main(String[] args) {
		
		Table lock = new Table();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				
				lock.printTable(5);
			}
		};
		Thread t2 = new Thread(){
			@Override
			public void run() {
				
				lock.printTable(9);
			}
		};
		t1.start();
		t2.start();

	}

}
