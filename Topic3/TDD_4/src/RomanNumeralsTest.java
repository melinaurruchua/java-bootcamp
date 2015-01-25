import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class to convert Roman to Decimal or Decimal to Roman
 * @author meli
 *
 */

public class RomanNumeralsTest {

	@Test
	public void testRomanToDecimal() {
		NumberManager number= new NumberManager("XLV");
		assertEquals(45,number.RomanToDecimal());
	}
	
	@Test
	public void testDecimalToRoman() {
		NumberManager number= new NumberManager(5);
		assertEquals("V",number.DecimalToRoman());
	}

}
