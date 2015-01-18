/**
* @author Melina
* @version 1.0 
*/ 

public class Client {
	private String name;
	private int creditNumber;
	private String email;
	private String pass;
	
	private IPayStrategy strategy;
	
	private ShoppingCart cart;
	
	public Client(String name, int creditNumber, String email, String pass) {
		this.name=name;
		this.creditNumber=creditNumber;
		this.email=email;
		this.pass=pass;
		cart = new ShoppingCart();
	}
	
	//make the payment transaction
	public void payment() {
		System.out.println("Payment transaction ");
		strategy.pay(cart);
	}
	
	public IPayStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IPayStrategy strategy) {
		this.strategy = strategy;
	}

	public String showCart() {
		return cart.showProducts();
	}

	public void addToCart(Item p) {
		this.cart.addProduct(p);
	}
	
	public void removeFromCart(Item p){
		this.cart.removeProduct(p);
	}
	
	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
