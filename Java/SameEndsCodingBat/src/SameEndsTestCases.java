import static org.junit.Assert.*;

import org.junit.Test;

public class SameEndsTestCases {

	@Test
	public void groundZeroTest() {
		assertEquals(SameEnds.sameEnds(""), "");
	}

	@Test
	public void simpleTests() {
		assertEquals(SameEnds.sameEnds("xx"), "x");
	}

	@Test
	public void tripleXTest() {
		assertEquals(SameEnds.sameEnds("xxx"), "x");
	}

	@Test
	public void phraseTest() {
		assertEquals(SameEnds.sameEnds("Hello! and Hello!"), "Hello!");
	}

	@Test
	public void javaWordTests() {
		assertEquals(SameEnds.sameEnds("javaXYZjava"), "java");
	}

	@Test
	public void almostEqualTest() {
		assertEquals(SameEnds.sameEnds("xavaXYZjava"), "");
		assertEquals(SameEnds.sameEnds("javaXYZjavax"), "");
	}
	
}
