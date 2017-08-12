import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountAndSayTests {

	@Test
	public void valueTwo() {
		assertEquals(CountAndSay.valueNth(2),"11");
	}
	
	@Test
	public void valueThree() {
		assertEquals(CountAndSay.valueNth(3),"21");
	}
	
	@Test
	public void valueFour() {
		assertEquals(CountAndSay.valueNth(4),"1211");
	}
	
	@Test
	public void valueSix() {
		assertEquals(CountAndSay.valueNth(6),"312211");
	}
}
