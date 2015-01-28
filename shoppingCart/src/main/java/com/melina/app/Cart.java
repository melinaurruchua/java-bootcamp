package com.melina.app;

import java.util.ArrayList;
import java.util.List;

public class Cart implements IShoppingCart{
	private List<Item> items;
	
	public Cart(){
		items=new ArrayList<Item>();
	}
	public void addProduct(String name, String cost) {
		Item e=new Item(name, cost);
		items.add(e);
	}

	public void removeProduct(String name) {
		items.remove(items.indexOf(name));
	}

	public String showProducts() {
		String products=new String();
		for (Item i: items){
			products=products+i.getName()+" ";
		}
		return products;
	}

	public double getTotalCost() {
		double total=0;
		for (Item i: items){
			total+=i.getCost();
		}
		return total;
	}

}
