/**
* @author Melina
* @version 1.0 Strategy Pattern
*/

public class PayStrategyPaypal implements IPayStrategy{
	private String email;
	private String pass;
	
	public PayStrategyPaypal(String email, String pass) {
		this.setEmail(email);
		this.setPass(pass);
	}

	@Override
	public void pay(ShoppingCart cart) {
		System.out.println("pay with Paypal the corresponding amount: " + cart.getTotalCost());
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
