/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class discountSimple implements discountPolicy{
	private int percentaje;
	
	public discountSimple(int percentaje) {
		this.percentaje=percentaje;
	}
	
	@Override
	public double makeDiscount(ShoppingCart cart) {
		double amount = cart.getTotalCost();
		return amount - (amount * percentaje / 100);
	}
	
}
