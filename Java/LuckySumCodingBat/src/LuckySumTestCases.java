import static org.junit.Assert.*;

import org.junit.Test;

public class LuckySumTestCases {

	@Test
	public void noThirteen() {
		assertEquals(LuckySum.luckySum(1, 2, 3),6);
		assertEquals(LuckySum.luckySum(6, 5, 2),13);
		assertEquals(LuckySum.luckySum(7, 2, 1),10);
	}
	
	@Test
	public void withThirteen() {
		assertEquals(LuckySum.luckySum(1, 13, 13),1);
		assertEquals(LuckySum.luckySum(1, 2, 13),3);
		assertEquals(LuckySum.luckySum(13,13,13),0);
		assertEquals(LuckySum.luckySum(8, 13, 2),8);
		assertEquals(LuckySum.luckySum(13, 4, 2),0);
	}
	
	@Test
	public void gorudZeroTest() {
		assertEquals(LuckySum.luckySum(0,0,0),0);
	}
	
	@Test
	public void negativeNums() {
		assertEquals(LuckySum.luckySum(-3,-1,0),-4);
		assertEquals(LuckySum.luckySum(-13,-1,0),-14);
		assertEquals(LuckySum.luckySum(-13,-13,0),-26);
		assertEquals(LuckySum.luckySum(13,-13,0),0);
	}
}
