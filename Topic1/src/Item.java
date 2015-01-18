/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

import java.util.Hashtable;


public class Item extends ItemAbs{
	
	private int amount;  
	private Hashtable<String,Object> feature = new Hashtable<String,Object>();
	
	public Item(String name, double cost){
		super(name, cost);
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int s){
		this.amount = s;
	}

	public Hashtable<String,Object> getFeature() {
		return feature;
	}

	public void setFeature(Hashtable<String,Object> feature) {
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
	
	
}
