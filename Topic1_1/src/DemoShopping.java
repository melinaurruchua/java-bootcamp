
public class DemoShopping {

	public static void main(String[] args) {
		StrategyClient cliente1= new StrategyClient("cliente", 235, "", "");
		
		IPayStrategy strategyCreditCard = new StrategyCreditCard(cliente1.getName(), cliente1.getCreditNumber());
		discountPolicy discountCreditCard = new discountSimple();
		cliente1.payment(discountCreditCard, 10);
	}

}
