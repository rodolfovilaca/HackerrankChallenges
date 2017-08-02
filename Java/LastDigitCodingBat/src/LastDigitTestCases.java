import static org.junit.Assert.*;

import org.junit.Test;

public class LastDigitTestCases {

	@Test
	public void test() {
		assertEquals(LastDigit.lastDigit(7, 17),true);
		assertEquals(LastDigit.lastDigit(6, 17),false);
		assertEquals(LastDigit.lastDigit(3, 113),true);
		assertEquals(LastDigit.lastDigit(114, 113),false);
		assertEquals(LastDigit.lastDigit(114, 4),true);
		assertEquals(LastDigit.lastDigit(10, 0),true);
		assertEquals(LastDigit.lastDigit(11, 0),false);
	}

}
