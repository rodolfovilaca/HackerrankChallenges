import static org.junit.Assert.*;

import org.junit.Test;

public class IsNotTestCases {

	@Test
	public void groundZeroTest() {
		assertEquals(IsNot.notReplace(""),"");
	}
	
	@Test
	public void simpleTest() {
		assertEquals(IsNot.notReplace("is"),"is not");
	}
	
	@Test
	public void isisTest() {
		assertEquals(IsNot.notReplace("isis"),"isis");
	}
	
	@Test
	public void phraseTest() {
		assertEquals(IsNot.notReplace("Dis is bliss is"),"Dis is not bliss is not");
	}
	
	@Test
	public void diffCharacters() {
		assertEquals(IsNot.notReplace("is-is"),"is not-is not");
	}

}
