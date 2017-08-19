import static org.junit.Assert.*;

import org.junit.Test;

public class CountYZTestCases {

	@Test
	public void groundZeroTest() {
		assertEquals(CountYZ.countYZ(""),0);
	}
	
	@Test
	public void simpleTests() {
		assertEquals(CountYZ.countYZ("day fyyyz"),2);
	}
	
	@Test
	public void anotherCharacters() {
		assertEquals(CountYZ.countYZ("!!day--yaz!!"),2);
	}
	
	@Test
	public void mixedCapsTests() {
		assertEquals(CountYZ.countYZ("DAY abc XYZ"),2);
	}
	
	@Test
	public void numbersTest() {
		assertEquals(CountYZ.countYZ("y2bz"),2);
	}

}
