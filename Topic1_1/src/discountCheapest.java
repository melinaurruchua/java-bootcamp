
public class discountCheapest implements discountPolicy{

	@Override
	public double makeDiscount(ShoppingCart cart, int percentaje) {
		double amount = cart.mostCheapestItem().getAmount();
		return cart.getTotalCost() - (amount * percentaje / 100);
	}
	
}
