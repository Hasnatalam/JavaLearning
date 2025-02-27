package com.hasnat.lambdaExpression;

import java.util.function.Consumer;

public class Tester {

	public static void main(String[] args) {
		/*Consumer<ShopingCart> consumer = new Consumer<ShopingCart>() {
			
			@Override
			public void accept(ShopingCart sc) {
				double totalPrice = sc.getCartItem().getTotalPrice();
				double discount = 0.0;
				if(totalPrice > 1000000) {
					discount = (totalPrice*0.1);
				}
				System.out.println("Your Discount Price :: " + discount);
				System.out.println("After Discount Your bill :: " + (totalPrice-discount));
			}
		};*/
		
		Consumer<ShopingCart> consumer = sc -> {
			double totalPrice = sc.getCartItem().getTotalPrice();
			double discount = 0.0;
			if(totalPrice > 1000000) {
				discount = (totalPrice*0.1);
			}
			System.out.println("Your Discount Price :: " + discount);
			System.out.println("After Discount Your bill :: " + (totalPrice-discount));
		};
		
		
		ShopingCart cart1 = new ShopingCart(new CartItem("Laptop", 87671.8, 2));
		System.out.println(cart1);
		consumer.accept(cart1);
	}

}
