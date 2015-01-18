/**
* @author Melina
* @version 1.0 Strategy Pattern
*/

public class PayStrategyCreditCard implements IPayStrategy{
	private String name;
	private int creditNumber;
	
	public PayStrategyCreditCard(String name, int creditNumber) {
		this.setName(name);
		this.setCreditNumber(creditNumber);
	}
	
	@Override
	public void pay(ShoppingCart cart) {
		System.out.println("pay by Credit Card the corresponding amount: " + cart.getTotalCost());
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
