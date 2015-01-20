/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class PayStrategyCash implements IPayStrategy{
	private DiscountMoreExpensive discount;
	
	public PayStrategyCash(DiscountPolicy discount) {
		this.discount=(DiscountMoreExpensive) discount;
	}

	@Override
	public double pay(ShoppingCart cart) {
		double d=discount.applyDiscount(cart);
		System.out.println("pay in Cash  the corresponding amount: " + d);
		return d;
	}

}
