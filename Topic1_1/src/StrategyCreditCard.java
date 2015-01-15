
public class StrategyCreditCard implements IPayStrategy{
	private String name;
	private int creditNumber;
	
	public StrategyCreditCard(String name, int creditNumber) {
		this.setName(name);
		this.setCreditNumber(creditNumber);
	}
	
	@Override
	public void pay(double amount) {
		System.out.print("pay by Credit Card the corresponding amount: " + amount);
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
