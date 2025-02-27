package com.hasnat.basic;

public class DominosBillGenerator {
	public static void main(String [] args){

		int chickenRollsRate = 60;

		int vegetablePuffsRate = 25;

		int discount=50;
		
		int rollQuantity = Integer.parseInt(args[0]);

		int puffQuantity = Integer.parseInt(args[1]);


		System.out.println("\n\n\nItem             Quantity       Rate       amount");

		System.out.println("Chicken roll        " +rollQuantity+ "\t\t"+chickenRollsRate+ "         = " +(rollQuantity*chickenRollsRate));

		System.out.println("Vegetable puffs     " +puffQuantity+ "\t\t"+vegetablePuffsRate+ "         =  " +(puffQuantity*vegetablePuffsRate));

		System.out.println("Total amount   \t\t\t\t   = "+((rollQuantity*chickenRollsRate)+(puffQuantity*vegetablePuffsRate)));	

		System.out.println("Discount       \t\t\t\t   =  "+discount);

		System.out.println("Payable amount \t\t\t\t   = "+((rollQuantity*chickenRollsRate)+(puffQuantity*vegetablePuffsRate)-discount));

	}
}
