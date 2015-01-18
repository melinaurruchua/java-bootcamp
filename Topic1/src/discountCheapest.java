/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class discountCheapest implements discountPolicy{
	private int percentaje;
	
	public discountCheapest(int percentaje) {
		this.percentaje=percentaje;
	}
	
	@Override
	public double makeDiscount(ShoppingCart cart) {
		double cost = cart.mostCheapestItem().getCost();
		return cart.getTotalCost() - (cost * percentaje / 100);
	}
	
}
