import static org.junit.Assert.*;

import org.junit.Test;

public class MirrorEndsTestCases {

	@Test
	public void groundZeroTest() {
		assertEquals(MirrorEnds.mirrorEnds(""), "");
	}

	@Test
	public void simpleTest() {
		assertEquals(MirrorEnds.mirrorEnds("aba"), "aba");
	}

	@Test
	public void tripleXTest() {
		assertEquals(MirrorEnds.mirrorEnds("xxx"), "xxx");
	}

	@Test
	public void phraseTest() {
		assertEquals(MirrorEnds.mirrorEnds("Hi and iH"), "Hi ");
	}

	@Test
	public void numbersTest() {
		assertEquals(MirrorEnds.mirrorEnds("123and then 321"), "123");
	}
	
	@Test
	public void almostEqualTest() {
		assertEquals(MirrorEnds.mirrorEnds("Hi xxxiH"), "Hi");
	}
}
