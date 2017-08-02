import static org.junit.Assert.*;

import org.junit.Test;

public class Close10TestCases {

	@Test
	public void close10Tests() {
		assertEquals(Close10.close10(8, 13),8);
		assertEquals(Close10.close10(13, 8),8);
		assertEquals(Close10.close10(13, 7),0);
		assertEquals(Close10.close10(7, 13),0);
		assertEquals(Close10.close10(9, 13),9);
		assertEquals(Close10.close10(10, 12),10);
		assertEquals(Close10.close10(11, 10),10);
		assertEquals(Close10.close10(5, 21),5);
		assertEquals(Close10.close10(0, 20),0);
		assertEquals(Close10.close10(10, 10),0);
	}

}
