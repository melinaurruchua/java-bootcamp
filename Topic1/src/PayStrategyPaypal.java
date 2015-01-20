/**
* @author Melina
* @version 1.0 Strategy Pattern
*/

public class PayStrategyPaypal implements IPayStrategy{
	private String email;
	private String pass;
	
	private DiscountCheapest discount;
	
	public PayStrategyPaypal(String email, String pass,DiscountPolicy discount) {
		this.setEmail(email);
		this.setPass(pass);
		this.discount=(DiscountCheapest) discount;
	}

	@Override
	public double pay(ShoppingCart cart) {
		double d=discount.applyDiscount(cart);
		System.out.println("pay with Paypal the corresponding amount: " + d);
		return d;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
