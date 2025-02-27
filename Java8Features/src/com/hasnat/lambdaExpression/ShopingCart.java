package com.hasnat.lambdaExpression;

public class ShopingCart {

	private CartItem cartItem;

	public ShopingCart(CartItem cartItem) {
		super();
		this.cartItem = cartItem;
	}

	protected CartItem getCartItem() {
		return cartItem;
	}

	protected void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	@Override
	public String toString() {
		return "ShopingCart [cartItem=" + cartItem + "]";
	}

}
