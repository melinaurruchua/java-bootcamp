import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
/**
 * Test class to prove Word Wrapped
 * @author meli
 *
 */

public class wordWrappingTest {
	private List<String> list;
	@Test
	public void testRowLongerThanInput() {
		
		WordWrappedRows wordRows = new WordWrappedRows(20);
		list=wordRows.getList("Not yet implemented");
		assertEquals(list.get(0), "Not yet implemented");
	}
	@Test
	public void testRowShortestThanInput() {
		WordWrappedRows wordRows = new WordWrappedRows(7);
		list=wordRows.getList("Hello Word!");
		assertEquals(list.get(0), "Hello");
		assertEquals(list.get(1), "Word!");
	}
	@Test
	public void testRowShortestThanInput_3() {
		WordWrappedRows wordRows_3 = new WordWrappedRows(3);
		list=wordRows_3.getList("a b c d e f");
		assertEquals(list.get(0), "a b");
		assertEquals(list.get(1), "c d");
		assertEquals(list.get(2), "e f");
	}
	
	@Test
	public void testRowShortestThanInput_5() {
		WordWrappedRows wordRows_5 = new WordWrappedRows(5);
		list=wordRows_5.getList("Excelent");
		assertEquals(list.get(0), "Excel");
		assertEquals(list.get(1), "ent");
	}
	
}
