import java.util.ArrayList;
import java.util.List;


public class ShoppingCart implements Subject{
	private List<ItemAbs> items = new ArrayList<ItemAbs>();
	
	private List<Observer> observers = new ArrayList<Observer>();

	private Sequence counter = Sequence.getInstance();
	
	public ShoppingCart(){
		
	}
	
	public void addProduct(ItemAbs e){
		items.add(e);
		this.notify("new Item/Offer added"); //notify when a new offer is added
	}
	
	public void removeProduct(ItemAbs e){
        this.items.remove(e);
    }
	
	public String showProducts(){
		String show = null;
		for (ItemAbs p: items){
			show += p.showOffer();
		}
		return show;
	}
	
	public ItemAbs mostExpensiveItem(){
		ItemAbs expensive = null;
		double cost=0;
		for (ItemAbs item: items){
			if (cost < item.getCost()){
				expensive=item;
				cost=item.getCost();
			}
		}
		return expensive;
		
	}
	
	public ItemAbs mostCheapestItem(){
		ItemAbs cheapest = null;
		double cost=items.get(0).getCost();
		for (ItemAbs item: items){
			if (cost > item.getCost()){
				cheapest=item;
				cost=item.getCost();
			}
		}
		return cheapest;
		
	}
	
	public double getTotalCost(){
		double cost=0;
		for (ItemAbs item: items){
			double a= item.getCost();
			cost+=a;
		}
		return cost;
	}
	
	public void changePriceProduct(double price, ItemAbs product){
		product.setCost(price);
		this.notify("A price has change: " + product.getName() + "new cost: $" + price); //notify when a price changes
	}
	
	public void payCart(){
		int id= counter.getCounter(); 
		Sequence.getNext();
		this.notify("A new transaction was made - ID: " + id + "Total cost: $" + this.getTotalCost()); //notify when A new transaction was made
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notify(String g) {
		System.out.println(g);
		for (Observer o: observers){
			o.update(g);
		}
	}


}
