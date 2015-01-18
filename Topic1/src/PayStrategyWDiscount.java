/**
* @author Melina
* @version 1.0 Strategy Pattern
*/

public class PayStrategyWDiscount implements IPayStrategy{
	private IPayStrategy strategy;
	private discountPolicy discount;
	
	public PayStrategyWDiscount(IPayStrategy strategy, discountPolicy discount) {
		this.strategy=strategy;
		this.discount=discount;
	}
	
	@Override
	public void pay(ShoppingCart cart) {
		strategy.pay(cart);
		System.out.println("pay with a discount : " + discount.makeDiscount(cart));
		
	}

}
