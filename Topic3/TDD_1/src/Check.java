/**
 * Check class
 * @author meli
 *
 */
public class Check {
	private static final String[] UNIDADES = { "", "One", "Two", "Three",
        "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "EIGHteen", "Nineteen"};

	 private static final String[] DECENAS = {"", "","Twenty", "Thirty", "Fourty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	 private static final String[] GROUPS = { "hundred ", "thousand ", "million " };
	 
	 public static String convertAmountToString(Double d) {
		String g=Double.toString(d);
		System.out.println(g);
		
		Integer i= d.intValue();
		String number = i.toString();
		int lenghtNumber= number.length();
		System.out.println("cantidad de digitos enteros "+lenghtNumber);
		int pot = (int) Math.pow(10, lenghtNumber-1);
		System.out.println("potencia "+ pot);
		StringBuilder output = new StringBuilder();
		while (pot != 0){
			int u=(int)i/pot;
			System.out.println("u"+u);
			if (u != 0){
				if(lenghtNumber == 5){
					if(u > 1){
						output.append(DECENAS[u] + "-");
					}
					else{ 
						int a=i/(pot/10);
						System.out.println("a "+a);
						output.append(UNIDADES[a] +" "+ GROUPS[1]);
						lenghtNumber--;
						i-=a*(pot/10);
						System.out.println("i ren "+i);
						pot=(int)pot/10;
					}
				}
				else if (lenghtNumber == 4){
					output.append(UNIDADES[u] +" "+ GROUPS[1]);
				}
				else if (lenghtNumber == 3 || lenghtNumber == 6){
					output.append(UNIDADES[u] +" " + GROUPS[0]);
				}
				else if (lenghtNumber == 2){
					if(u > 1){  //>20
						output.append(DECENAS[u] + "-");
					}
					else{   //<20
						output.append(UNIDADES[i]);
						lenghtNumber--;
					}
				}else if (lenghtNumber == 1){
						output.append(UNIDADES[u]);
				}
				
			}
			lenghtNumber--;
			if (u>1) i-=u*pot;
			pot=(int)pot/10;
		}
		
		//double decimal= d.parseDouble(number);
		String amountOnText = Double.toString(d);
		String[] nums = amountOnText.split("\\.");
		String amountOnTextDecimal = nums[1];
		
		System.out.println("number "+ output.toString() + " and " + amountOnTextDecimal + "/100 dollars");
		
		
		return output.toString() + " and " + amountOnTextDecimal + "/100 dollars";
	}

}
