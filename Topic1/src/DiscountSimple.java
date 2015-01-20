/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class DiscountSimple implements DiscountPolicy{
	private int percentaje;
	
	public DiscountSimple(int percentaje) {
		this.percentaje=percentaje;
	}

	@Override
	public double applyDiscount(ShoppingCart cart) {
		System.out.println("apply discount " + percentaje + "%.");
		double amount = cart.getTotalCost();
		return amount - (amount * percentaje / 100);
	}
	
}
