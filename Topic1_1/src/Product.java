
public class Product {
	
	private String name;
	private double cost;
	private int amount;  //you can buy more than one
	
	public Product(String name, double cost, int amount){
		this.name=name;
		this.cost=cost;
		this.setAmount(amount);
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}
	
}
