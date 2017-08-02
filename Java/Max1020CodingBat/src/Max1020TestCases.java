import static org.junit.Assert.*;

import org.junit.Test;

public class Max1020TestCases {

	@Test
	public void test() {
		assertEquals(Max1020.max1020(11, 19),19);
		assertEquals(Max1020.max1020(19, 11),19);
		assertEquals(Max1020.max1020(11, 9),11);
		assertEquals(Max1020.max1020(9, 21),0);
		assertEquals(Max1020.max1020(10, 21),10);
		assertEquals(Max1020.max1020(21, 10),10);
		assertEquals(Max1020.max1020(9, 11),11);
		assertEquals(Max1020.max1020(23, 10),10);
		assertEquals(Max1020.max1020(20, 10),20);
		assertEquals(Max1020.max1020(7, 20),20);
		assertEquals(Max1020.max1020(17, 16),17);
	}

}
