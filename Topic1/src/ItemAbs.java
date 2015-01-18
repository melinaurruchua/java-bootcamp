/**
* @author Melina
* @version 1.0 Composite Pattern
*/

public abstract class ItemAbs{
	private String name;
	protected double cost;
	
	public ItemAbs(String name, double cost){
		this.setName(name);
		this.setCost(cost);
	}
	
	public abstract String showOffer();
	
	public abstract double getCost();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
