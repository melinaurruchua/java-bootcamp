/**
* @author Melina
* @version 1.0 Composite Pattern
*/ 

import java.util.ArrayList;
import java.util.List;


public class Offer extends ItemAbs{
	private List<ItemAbs> offers = new ArrayList<ItemAbs>();
	
	public Offer(String name, double cost){
		super(name, cost);
	}

	public void addOffers(ItemAbs offer) {
		this.offers.add(offer);
	}
	
	public void removeOffers(ItemAbs offer) {
		this.offers.remove(offer);
	}

	public double getCost() {
		double price=0;
		for (ItemAbs p: offers){
			 price += p.getCost();
		}
		return price;
	}
	
	@Override
	public String showOffer() {
		String offer = "Offer " + this.getName() + ".....$" + Double.toString(cost);
		String subOffers=null;
		for (ItemAbs p: offers){
			subOffers += "Item" + p.getName() + ".....$" + Double.toString(p.getCost());
		}
		return offer + subOffers;
	}
	
}
