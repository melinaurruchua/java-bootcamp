package com.melina.app;

public class Item {

	private double cost;
	private String name;

	public Item(String name, String cost) {
		this.name=name;
		this.cost=Double.parseDouble(cost);
	}

	public double getCost() {
		return cost;
	}
	
	public String getName() {
		return name;
	}

}
