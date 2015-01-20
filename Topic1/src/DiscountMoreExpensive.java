/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class DiscountMoreExpensive implements DiscountPolicy{
	private int percentaje;
	
	public DiscountMoreExpensive(int percentaje) {
		this.percentaje=percentaje;
	}
	
	@Override
	public double applyDiscount(ShoppingCart cart) {
		System.out.println("apply discount " + percentaje + "% to the more expensive item.");
		double cost = cart.mostExpensiveItem().getCost();
		return cart.getTotalCost() - (cost * percentaje / 100);
	}
	
}
