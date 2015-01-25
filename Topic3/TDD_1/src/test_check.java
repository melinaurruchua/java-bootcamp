import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class to prove: convert a number to a check text
 * @author meli
 *
 */
public class test_check {

	@Test
	public void numberToTextTest() {
		assertEquals("Two hundred Twelve thousand Five hundred Twenty-Three and 04/100 dollars",Check.convertAmountToString(212523.04));
		assertEquals("Twenty-Three and 05/100 dollars",Check.convertAmountToString(23.05));
	}

}
