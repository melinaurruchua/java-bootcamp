/**
* @author Melina
* @version 1.0 Observer Pattern
*/ 

import java.util.ArrayList;
import java.util.List;


public class MarketManager implements Observer{
	private static MarketManager instance = null;
	
	private List<IOffer> products = new ArrayList<IOffer>();
	private List<String> notice = new ArrayList<String>();
	
	private MarketManager() {
		
	}
	
	public List<IOffer> getProducts() {
		return products;
	}

	public void addProduct(IOffer product) {
		this.products.add(product);
	}
	
	public void removeProduct(IOffer product) {
		this.products.remove(product);
	}
	
	@Override
	public void update(String g) {
		notice.add(g);
	}

	public static MarketManager getInstance() {
		if(instance==null) {
		      instance = new MarketManager();
		}
		return instance;
	}

	
}
