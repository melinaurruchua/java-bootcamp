
public class DemoShopping {

	public static void main(String[] args) {
		Sequence counter = Sequence.getInstance();
		MarketManager market;
		Client cliente1= new Client("cliente", 235, "", "");
		
		DiscountPolicy discountCreditCard = new DiscountSimple(10);
		IPayStrategy strategyCreditCard = new PayStrategyCreditCard(cliente1.getName(), cliente1.getCreditNumber(),discountCreditCard);
		
		cliente1.addCart(null);
		
		
	}

}
