import static org.junit.Assert.*;

import org.junit.Test;

public class EveryNthTestCases {

	@Test
	public void test() {
		assertEquals(EveryNth.everyNth("Miracle", 2),"Mrce");
		assertEquals(EveryNth.everyNth("abcdefg", 2),"aceg");
		assertEquals(EveryNth.everyNth("abcdefg", 3),"adg");
		assertEquals(EveryNth.everyNth("Chocolate", 3),"Cca");
		assertEquals(EveryNth.everyNth("Chocolates", 3),"Ccas");
		assertEquals(EveryNth.everyNth("Chocolates", 4),"Coe");
		assertEquals(EveryNth.everyNth("Chocolates", 100),"C");
	}

}
