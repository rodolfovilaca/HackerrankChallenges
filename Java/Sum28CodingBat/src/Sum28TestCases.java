import static org.junit.Assert.*;

import org.junit.Test;

public class Sum28TestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		assertEquals(Sum28.sum28(nums), false);
	}

	@Test
	public void simple8Test() {
		int[] nums = {8};
		assertEquals(Sum28.sum28(nums), false);
	}

	@Test
	public void only2Test() {
		int[] nums = {2, 2, 2, 2, 2};
		assertEquals(Sum28.sum28(nums), false);
	}

	@Test
	public void trueTest() {
		int[] nums = {1, 2, 2, 1, 2, 2};
		assertEquals(Sum28.sum28(nums), true);
	}

	@Test
	public void almostTrueTest() {
		int[] nums = {2, 2, 2};
		assertEquals(Sum28.sum28(nums), false);
	}


}
