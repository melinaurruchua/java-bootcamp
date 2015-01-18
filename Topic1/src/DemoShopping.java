
public class DemoShopping {

	public static void main(String[] args) {
		Sequence counter = Sequence.getInstance();
		marketManager market = new marketManager();
		Client cliente1= new Client("cliente", 235, "", "");
		
		IPayStrategy strategyCreditCard = new PayStrategyCreditCard(cliente1.getName(), cliente1.getCreditNumber());
		discountPolicy discountCreditCard = new discountSimple(10);
		cliente1.payment();
		
		
	}

}
