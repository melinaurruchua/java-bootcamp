/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

import java.util.Hashtable;
import java.util.Map;


public class Item implements IOffer{
	
	private String name;
	private double cost;
	private int amount;  
	private Map<String,Object> feature = new Hashtable<String,Object>();
	
	public Item(String name, double cost){
		this.name=name;
		this.cost=cost;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int s){
		this.amount = s;
	}

	public Map<String,Object> getFeature() {
		return feature;
	}

	public void setFeature(Map<String,Object> feature) {
		this.feature = feature;
	}
	
	public void addFeature(String s, Object o){
		feature.put(s, o);
	}
	
	public void removeFeature(String s){
		feature.remove(s);
	}

	public String showOffer() {
		return ("Item " + this.getName() + ".....$" + Double.toString(cost));
	}

	public double getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
