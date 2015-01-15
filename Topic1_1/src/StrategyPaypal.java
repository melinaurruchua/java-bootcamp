
public class StrategyPaypal implements IPayStrategy{
	private String email;
	private String pass;
	
	public StrategyPaypal(String email, String pass) {
		this.setEmail(email);
		this.setPass(pass);
	}

	@Override
	public void pay(double amount) {
		System.out.print("pay with Paypal the corresponding amount: " + amount);
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
