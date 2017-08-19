import static org.junit.Assert.*;

import org.junit.Test;

public class GHappyTestCases {

	@Test
	public void groundZeroTest() {
		assertEquals(GHappy.gHappy(""),true);
	}
	
	@Test
	public void simpleTests() {
		assertEquals(GHappy.gHappy("xxggxx"),true);
	}
	
	@Test
	public void tripleGTest() {
		assertEquals(GHappy.gHappy("yyygggxyy"),true);
	}
	
	@Test
	public void lastGTest() {
		assertEquals(GHappy.gHappy("xxgggxyg"),false);
	}
	
	@Test
	public void oneGTest() {
		assertEquals(GHappy.gHappy("g"),false);
	}
	
	@Test
	public void onlyGTest() {
		assertEquals(GHappy.gHappy("ggggggggg"),true);
	}

}
