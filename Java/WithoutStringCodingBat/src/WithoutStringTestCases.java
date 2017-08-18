import static org.junit.Assert.*;

import org.junit.Test;

public class WithoutStringTestCases {

	@Test
	public void groundZeroTest() {
		assertEquals(WithoutString.withoutString("", ""),"");
	}
	
	@Test
	public void simpleTests() {
		assertEquals(WithoutString.withoutString("abxxxxab", "xx"),"abab");
	}
	
	@Test
	public void numberTests() {
		assertEquals(WithoutString.withoutString("1111", "11"),"");
	}
	
	@Test
	public void mixedCapsTests() {
		assertEquals(WithoutString.withoutString("MkjtMkx", "mk"),"jtx");
		assertEquals(WithoutString.withoutString("AA22bb", "BB"),"AA22");
	}
}
