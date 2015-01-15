import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
	private List<Product> items = new ArrayList<Product>();
	
	public ShoppingCart(){
		
	}
	
	public void addProduct(Product e){
		items.add(e);
	}
	
	public void removeProduct(Product e){
        this.items.remove(e);
    }
	
	public List<Product> showProducts(){
		return items;
	}
	
	public Product mostExpensiveItem(){
		Product expensive = null;
		double cost=0;
		for (Product item: items){
			if (cost < item.getCost()){
				expensive=item;
				cost=item.getCost();
			}
		}
		return expensive;
		
	}
	
	public Product mostCheapestItem(){
		Product cheapest = null;
		double cost=items.get(0).getCost();
		for (Product item: items){
			if (cost > item.getCost()){
				cheapest=item;
				cost=item.getCost();
			}
		}
		return cheapest;
		
	}
	
	public double getTotalCost(){
		double cost=0;
		for (Product item: items){
			double a= item.getAmount() * item.getCost();
			cost+=a;
		}
		return cost;
	}
}
