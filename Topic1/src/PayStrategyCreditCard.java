/**
* @author Melina
* @version 1.0 Strategy Pattern
*/

public class PayStrategyCreditCard implements IPayStrategy{
	private String name;
	private int creditNumber;
	
	private DiscountSimple discount;
	
	public PayStrategyCreditCard(String name, int creditNumber,DiscountPolicy discountCreditCard) {
		this.setName(name);
		this.setCreditNumber(creditNumber);
		this.discount=(DiscountSimple) discountCreditCard;
	}
	
	@Override
	public double pay(ShoppingCart cart) {
		double d=discount.applyDiscount(cart);
		System.out.println("pay by Credit Card the corresponding amount: " + d);
		return d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

}
