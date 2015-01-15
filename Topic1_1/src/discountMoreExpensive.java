
public class discountMoreExpensive implements discountPolicy{

	@Override
	public double makeDiscount(ShoppingCart cart, int percentaje) {
		double amount = cart.mostExpensiveItem().getAmount();
		return cart.getTotalCost() - (amount * percentaje / 100);
	}
	
}
