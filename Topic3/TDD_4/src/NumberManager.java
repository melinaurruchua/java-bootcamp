/**
 * NumberManager Class
 * @author meli
 *
 */

public class NumberManager {
	private String romanValue;
	private int DecimalValue;
	
	public NumberManager(String string) {
		romanValue=string;
	}
	
	public NumberManager(int number){
		DecimalValue=number;
	}

	public int RomanToDecimal() {
		if (romanValue.length() == 0)
	        throw new NumberFormatException("An empty string does not define a Roman numeral.");
		DecimalValue=0;
	    String romanNumeral = romanValue.toUpperCase();
	    for(int x = 0;x<romanNumeral.length();x++)
	    {
	        char convertToDecimal = romanNumeral.charAt(x);

	        switch (convertToDecimal)
	        {
	        case 'M':
	        	DecimalValue += 1000;
	            break;

	        case 'D':
	        	DecimalValue += 500;
	            break;

	        case 'C':
	        	DecimalValue += 100;
	            break;

	        case 'L':
	        	DecimalValue += 50;
	            break;

	        case 'X':
	        	DecimalValue += 10;
	            break;

	        case 'V':
	        	DecimalValue += 5;
	            break;

	        case 'I':
	        	DecimalValue += 1;
	            break;
	        }
	    }
	    if (romanNumeral.contains("IV"))
	    {
	    	DecimalValue-=2;
	    }
	    if (romanNumeral.contains("IX"))
	    {
	    	DecimalValue-=2;
	    }
	    if (romanNumeral.contains("XL"))
	    {
	    	DecimalValue-=20;
	    }
	    if (romanNumeral.contains("XC"))
	    {
	    	DecimalValue-=20;
	    }
	    if (romanNumeral.contains("CD"))
	    {
	    	DecimalValue-=200;
	    }
	    if (romanNumeral.contains("CM"))
	    {
	    	DecimalValue-=200;
	    }
	    System.out.println("Roman Number "+romanValue+", Decimal Equivalent = "+DecimalValue);
		
	    return DecimalValue;
	}

	public String DecimalToRoman() {
		if (DecimalValue<1){
			throw new NumberFormatException("Value of RomanNumeral must be positive.");
		}
		if (DecimalValue > 3999)
	        throw new NumberFormatException("Value of RomanNumeral must be 3999 or less.");
		romanValue= new String();
		
		String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int decimal[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		int decimalNumber=DecimalValue;
		for (int i=0; i<roman.length; i++) {
			while (decimalNumber >= decimal[i]){
				decimalNumber = decimalNumber-decimal[i];
				romanValue = romanValue+roman[i];
            }
        }
		System.out.println("Number "+DecimalValue+", Roman Equivalent = "+romanValue);
		
		return "V";
	}

	
}
