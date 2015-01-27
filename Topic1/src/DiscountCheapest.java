/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class DiscountCheapest implements DiscountPolicy{
	private int percentaje;
	
	public DiscountCheapest(int percentaje) {
		this.percentaje=percentaje;
	}
	
	@Override
	public double applyDiscount(ShoppingCart cart) {
		System.out.println("apply discount " + percentaje + "% to the cheapest item.");
		double cost = cart.mostCheapestItem().getCost();
		return cart.getTotalCost() - (cost * percentaje / 100);
	}
	
}
