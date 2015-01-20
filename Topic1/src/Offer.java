/**
* @author Melina
* @version 1.0 Composite Pattern
*/ 

import java.util.ArrayList;
import java.util.List;


public class Offer implements IOffer{
	private String name;
	private double cost;
	private List<IOffer> offers = new ArrayList<IOffer>();
	
	public Offer(String name, double cost){
		this.name=name;
		this.cost=cost;
	}

	public void addOffers(IOffer offer) {
		this.offers.add(offer);
	}
	
	public void removeOffers(IOffer offer) {
		this.offers.remove(offer);
	}

	public double getRealCost() {
		double price=0;
		for (IOffer p: offers){
			 price += p.getCost();
		}
		return price;
	}
	
	@Override
	public String showOffer() {
		String offer = "Offer " + this.getName() + ".....$" + Double.toString(cost);
		String subOffers=null;
		for (IOffer p: offers){
			subOffers += "Item" + p.getName() + ".....$" + Double.toString(p.getCost());
		}
		return offer + subOffers;
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
