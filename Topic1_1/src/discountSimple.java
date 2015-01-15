
public class discountSimple implements discountPolicy{

	@Override
	public double makeDiscount(ShoppingCart cart, int percentaje) {
		double amount = cart.getTotalCost();
		return amount - (amount * percentaje / 100);
	}
	
}
