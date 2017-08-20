import static org.junit.Assert.*;

import org.junit.Test;

public class SumNumbersTestCases {

	@Test
	public void simpleTest() {
		assertEquals(SumNumbers.sumNumbers("abc123xyz"),123);
	}
	
	@Test
	public void onlyNumbers() {
		assertEquals(SumNumbers.sumNumbers("7 11"),18);
	}
	
	@Test
	public void wordNumbers() {
		assertEquals(SumNumbers.sumNumbers("5hoco1a1e"),7);
	}
	
	@Test
	public void onlyWord() {
		assertEquals(SumNumbers.sumNumbers("Chocolate"),0);
	}
	
	@Test
	public void allCharacters() {
		assertEquals(SumNumbers.sumNumbers("5$$1;;1!!"),7);
	}

}
