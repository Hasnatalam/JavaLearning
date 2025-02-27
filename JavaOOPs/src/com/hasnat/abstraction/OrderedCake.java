package com.hasnat.abstraction;
	

	
public class OrderedCake extends Cake {
	
	private String message=null;
	
	public OrderedCake() {
		super("round","flavour",1);
	}

	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
	}



	public OrderedCake(String shape, String flavour, int qty, String message) {
		super(shape, flavour, qty);
		this.message = message;
	}
	
	
	protected void showCake() {
		if(message == null) {
		System.out.println("A "+super.getShape()+" "+super.getFlavour()+" cake "+super.getQty()+" kg ready @ "+super.getPrice());
		}
		else {
			System.out.println("A "+super.getShape()+" "+super.getFlavour()+" cake "+super.getQty()+" kg ready @ "+super.getPrice()+"\n"+message);
	}
	}

}
