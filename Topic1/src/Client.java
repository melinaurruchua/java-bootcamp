import java.util.ArrayList;
import java.util.List;

/**
* @author Melina
* @version 1.0 
*/ 

public class Client {
	private String name;
	private int creditNumber;
	private String email;
	private String pass;

	private List<ShoppingCart> carts;
	
	public Client(String name, int creditNumber, String email, String pass) {
		this.name=name;
		this.creditNumber=creditNumber;
		this.email=email;
		this.pass=pass;
		carts=new ArrayList<ShoppingCart>();
	}
	
	//make the payment transaction
	public void payment(int c) {
		System.out.println("Payment transaction ");
		carts.get(c).payCart();;
	}
	
	public String showCart(String idCart) {
		for (ShoppingCart cart: carts){
			if (idCart.equals(cart.getIdCart()))
				return cart.showProducts();
		}
		return null;
	}

	public void addToCart(int c,IOffer p) {
		carts.get(c).addProduct(p);
	}
	
	public void removeFromCart(int c,IOffer p){
		carts.get(c).removeProduct(p);
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

	public ShoppingCart getCart(int i) {
		return carts.get(i);
	}

	public void addCart(ShoppingCart cart) {
		carts.add(cart);
	}
	
}
