package com.hasnat.basic;

public class ProfitAndLossPercentage {

	public static void main(String[] args) {

		double sp = 1500;
		double cp = 1000;
		double loss = 0;
		double profit = 0;
		if(sp>cp) {
			profit =sp-cp;
			System.out.println("profit = "+profit+"  profit % = "+(profit/cp*100));
		}
		else {
			
			loss=cp-sp;
			System.out.println("Loss = "+loss+"  Loss % = "+(loss/cp*100));

		}
		
				
	}

}
