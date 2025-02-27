package com.hasnat.Multithread;
class Sleep extends Thread{
	@Override
	public void run() {
		
		for(int i= 1; i<=10;i++) {
			System.out.println("i value is "+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class SleepDemo {

	public static void main(String[] args) throws Exception{
		Sleep s = new Sleep();
		Thread.sleep(300);
		s.start();
		s.interrupt();
		
		
	}

}
