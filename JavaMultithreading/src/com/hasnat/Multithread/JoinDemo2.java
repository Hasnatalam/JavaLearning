package com.hasnat.Multithread;
class Alpha extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		Beta b1 = new Beta();
		b1.setName("Beta_Thread");
		
		b1.start();
		try {
			b1.join();
			System.out.println("Alpha Thread re-start");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=5;i++) {
			System.out.println(i+"by"+name);
		}
	}	
}
public class JoinDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Alpha a1 = new Alpha();
		a1.setName("alpha_thread");
		a1.start();
		
		
	}

}
class Beta extends Thread{
	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		for(int i =1;i<=5;i++) {
			System.out.println(i+"by"+name);
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Beta thread ended");
	}
}