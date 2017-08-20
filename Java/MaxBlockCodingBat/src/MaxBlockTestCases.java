import static org.junit.Assert.*;

import org.junit.Test;

public class MaxBlockTestCases {

	@Test
	public void groundZeroTest() {
		assertEquals(MaxBlock.maxBlock(""), 0);
	}

	@Test
	public void simpleTest() {
		assertEquals(MaxBlock.maxBlock("xyz"), 1);
	}

	@Test
	public void tripleXTest() {
		assertEquals(MaxBlock.maxBlock("xxx"), 3);
	}

	@Test
	public void capitalLettersTest() {
		assertEquals(MaxBlock.maxBlock("XXBBBbbxxXXXX"), 4);
	}

	@Test
	public void numbersTest() {
		assertEquals(MaxBlock.maxBlock("XX2222BBBbbXX2222"), 4);
	}
	
	@Test
	public void almostTripleXTest() {
		assertEquals(MaxBlock.maxBlock("xXx"), 1);
	}
}
