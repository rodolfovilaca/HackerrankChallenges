import static org.junit.Assert.*;

import org.junit.Test;

public class WordAppendTestCases {

	@Test
	public void simpleTest() {
		String[] strings = {"a", "b", "a"};
		assertEquals(WordAppend.wordAppend(strings),"a");
	}
	@Test
	public void emptyTest() {
		String[] strings = {};
		assertEquals(WordAppend.wordAppend(strings),"");
	}
	@Test
	public void andOrNotTest() {
		String[] strings = {"not", "and", "or", "and", "this", "and", "or", "that", "not"};
		assertEquals(WordAppend.wordAppend(strings),"andornot");
	}
	@Test
	public void repetitionsTest() {
		String[] strings = {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"};
		assertEquals(WordAppend.wordAppend(strings),"xxyyzzxx");
	}
}
