/**
* @author Melina
* @version 1.0 Strategy Pattern
*/ 

public class PayStrategyCash implements IPayStrategy{

	@Override
	public void pay(ShoppingCart cart) {
		System.out.println("pay in Cash  the corresponding amount: " + cart.getTotalCost());
	}

}
