package com.melina.app;

public interface IShoppingCart {
	
	public void addProduct(String name, String cost);
	
	public void removeProduct(String name);
	
	public String showProducts();
	
	public double getTotalCost();
}
