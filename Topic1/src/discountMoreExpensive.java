/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class discountMoreExpensive implements discountPolicy{
	private int percentaje;
	
	public discountMoreExpensive(int percentaje) {
		this.percentaje=percentaje;
	}
	
	@Override
	public double makeDiscount(ShoppingCart cart) {
		double cost = cart.mostExpensiveItem().getCost();
		return cart.getTotalCost() - (cost * percentaje / 100);
	}
	
}
