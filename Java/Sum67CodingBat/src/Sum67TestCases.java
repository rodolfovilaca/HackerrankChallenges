import static org.junit.Assert.*;

import org.junit.Test;

public class Sum67TestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		assertEquals(Sum67.sum67(nums), 0);
	}

	@Test
	public void simpleTest() {
		int[] nums = {1, 2, 2};
		assertEquals(Sum67.sum67(nums), 5);
	}

	@Test
	public void double67Test() {
		int[] nums = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
		assertEquals(Sum67.sum67(nums), 2);
	}

	@Test
	public void sevenCountsTest() {
		int[] nums = {1, 6, 7, 7};
		assertEquals(Sum67.sum67(nums), 8);
	}

	@Test
	public void nothingCountsTest() {
		int[] nums = {6, 8, 1, 6, 7};
		assertEquals(Sum67.sum67(nums), 0);
	}

}
