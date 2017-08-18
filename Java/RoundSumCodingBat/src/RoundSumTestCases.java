import static org.junit.Assert.*;

import org.junit.Test;

public class RoundSumTestCases {

	@Test
	public void roundUp() {
		assertEquals(RoundSum.roundSum(16, 17, 18),60);
		assertEquals(RoundSum.roundSum(8, 5, 7),30);
		assertEquals(RoundSum.roundSum(6, 7, 8),30);
	}
	@Test
	public void roundDown() {
		assertEquals(RoundSum.roundSum(12, 10, 24),40);
		assertEquals(RoundSum.roundSum(12, 13, 14),30);
		assertEquals(RoundSum.roundSum(0, 0, 1),0);
	}
	@Test
	public void mixRound() {
		assertEquals(RoundSum.roundSum(9, 4, 4),10);
		assertEquals(RoundSum.roundSum(45, 21, 30),100);
		assertEquals(RoundSum.roundSum(23, 11, 26),60);
	}
	@Test
	public void noRoundNeeded() {
		assertEquals(RoundSum.roundSum(20, 30, 40),90);
		assertEquals(RoundSum.roundSum(10, 10, 10),30);
		assertEquals(RoundSum.roundSum(40, 10, 20),70);
	}
	@Test
	public void groundZeroTest() {
		assertEquals(RoundSum.roundSum(0, 0, 0),0);
	}
}
