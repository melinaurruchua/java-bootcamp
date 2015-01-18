/**
* @author Melina
* @version 1.0 Observer Pattern
*/ 

import java.util.ArrayList;
import java.util.List;


public class marketManager implements Observer{
	private List<ItemAbs> products = new ArrayList<ItemAbs>();
	private List<String> notice = new ArrayList<String>();
	
	public List<ItemAbs> getProducts() {
		return products;
	}

	public void addProduct(ItemAbs product) {
		this.products.add(product);
	}
	
	public void removeProduct(ItemAbs product) {
		this.products.remove(product);
	}
	
	@Override
	public void update(String g) {
		notice.add(g);
	}
	
}
