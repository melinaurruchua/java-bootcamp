
public class StrategyCash implements IPayStrategy{

	@Override
	public void pay(double amount) {
		System.out.print("pay in Cash  the corresponding amount: " + amount);
	}

}
