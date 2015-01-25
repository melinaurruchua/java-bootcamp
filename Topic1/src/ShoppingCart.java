import java.util.ArrayList;
import java.util.List;


public class ShoppingCart implements Subject{
	private String IdCart;
	private List<IOffer> items = new ArrayList<IOffer>();
	
	private IPayStrategy strategy; //Pay Strategy
	
	private List<Observer> observers = new ArrayList<Observer>();

	private Sequence counter = Sequence.getInstance();
	
	public ShoppingCart(String id){
		setIdCart(id);
		addObserver(MarketManager.getInstance()); //add observer 
	}
	
	public void addProduct(IOffer e){
		items.add(e);
		this.notify("new Item/Offer added"); //notify when a new offer is added
	}
	
	public void removeProduct(IOffer e){
        this.items.remove(e);
    }
	
	public String showProducts(){
		String show = null;
		for (IOffer p: items){
			show += p.showOffer();
		}
		return show;
	}
	
	public IPayStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IPayStrategy strategy) {
		this.strategy = strategy;
	}
	
	public IOffer mostExpensiveItem(){
		IOffer expensive = null;
		double cost=0;
		for (IOffer item: items){
			if (cost < item.getCost()){
				expensive=item;
				cost=item.getCost();
			}
		}
		return expensive;
		
	}
	
	public IOffer mostCheapestItem(){
		IOffer cheapest = null;
		double cost=items.get(0).getCost();
		for (IOffer item: items){
			if (cost > item.getCost()){
				cheapest=item;
				cost=item.getCost();
			}
		}
		return cheapest;
		
	}
	
	public double getTotalCost(){
		double cost=0;
		for (IOffer item: items){
			double a= item.getCost();
			cost+=a;
		}
		return cost;
	}
	
	public void changePriceProduct(double price, IOffer product){
		product.setCost(price);
		this.notify("A price has change: " + product.getName() + "new cost: $" + price); //notify when a price changes
	}
	
	public void payCart(){
		int id= counter.getCounter(); 
		counter.getNext();
		double total=strategy.pay(this); //pay and apply discount
		this.notify("A new transaction was made - ID: " + id + "Total cost: $" + total); //notify when A new transaction was made
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

	public String getIdCart() {
		return IdCart;
	}

	public void setIdCart(String idCart) {
		IdCart = idCart;
	}


}
