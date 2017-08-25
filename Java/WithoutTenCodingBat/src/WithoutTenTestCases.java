import static org.junit.Assert.*;

import org.junit.Test;

public class WithoutTenTestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		int[] expected = {};
		assertArrayEquals(WithoutTen.withoutTen(nums), expected);
	}

	@Test
	public void simpleTest() {
		int[] nums = { 1, 99, 10 };
		int[] expected = { 1, 99, 0 };
		assertArrayEquals(WithoutTen.withoutTen(nums), expected);
	}

	@Test
	public void gapTest() {
		int[] nums = {10, 13, 10, 14, 10};
		int[] expected = {13, 14, 0, 0, 0};
		assertArrayEquals(WithoutTen.withoutTen(nums), expected);
	}

	@Test
	public void oneTen() {
		int[] nums = {10};
		int[] expected = {0};
		assertArrayEquals(WithoutTen.withoutTen(nums), expected);
	}

}
