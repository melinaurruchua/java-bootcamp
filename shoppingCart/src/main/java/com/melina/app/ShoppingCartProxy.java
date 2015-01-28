package com.melina.app;

public class ShoppingCartProxy implements IShoppingCart{
	private IShoppingCart cartImplementation;
	
	protected ShoppingCartProxy(IShoppingCart cart){
		this.cartImplementation=cart;
	}
	
	public void addProduct(String name, String cost) {
		cartImplementation.addProduct(name, cost);
	}

	public void removeProduct(String name) {
		cartImplementation.removeProduct(name);
	}

	public String showProducts() {
		return cartImplementation.showProducts();
	}

	public double getTotalCost() {
		return cartImplementation.getTotalCost();
	}

}
