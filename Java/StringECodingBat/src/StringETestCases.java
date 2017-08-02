import static org.junit.Assert.*;

import org.junit.Test;

public class StringETestCases {

	@Test
	public void testStringE() {
		assertEquals(StringE.stringE("Hello"),true);
		assertEquals(StringE.stringE("Heelle"),true);
		assertEquals(StringE.stringE("Heelele"),false);
		assertEquals(StringE.stringE("Hll"),false);
		assertEquals(StringE.stringE("e"),true);
		assertEquals(StringE.stringE(""),false);
	}

}
