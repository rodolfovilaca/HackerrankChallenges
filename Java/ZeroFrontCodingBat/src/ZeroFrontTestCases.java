import static org.junit.Assert.*;

import org.junit.Test;

public class ZeroFrontTestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		int[] expected = {};
		assertArrayEquals(ZeroFront.zeroFront(nums), expected);
	}

	@Test
	public void simpleTest() {
		int[] nums = { 1, 0, 0, 1 };
		int[] expected = { 0, 0, 1, 1 };
		assertArrayEquals(ZeroFront.zeroFront(nums), expected);
	}

	@Test
	public void stayTheSameTest() {
		int[] nums = { 0, 1 };
		int[] expected = { 0, 1 };
		assertArrayEquals(ZeroFront.zeroFront(nums), expected);
	}

	@Test
	public void nineGapTest() {
		int[] nums = { 9, 9, 0, 9, 0, 9 };
		int[] expected = { 0, 0, 9, 9, 9, 9 };
		assertArrayEquals(ZeroFront.zeroFront(nums), expected);
	}

}
