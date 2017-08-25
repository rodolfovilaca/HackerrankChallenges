import static org.junit.Assert.*;

import org.junit.Test;

public class ZeroMaxTestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		int[] expected = {};
		assertArrayEquals(ZeroMax.zeroMax(nums), expected);
	}
	
	@Test
	public void simpleTest() {
		int[] nums = {0, 5, 0, 3};
		int[] expected = {5, 5, 3, 3};
		assertArrayEquals(ZeroMax.zeroMax(nums), expected);
	}
	
	@Test
	public void biggerArrayTest() {
		int[] nums = {7, 0, 4, 3, 0, 2};
		int[] expected = {7, 3, 4, 3, 0, 2};
		assertArrayEquals(ZeroMax.zeroMax(nums), expected);
	}
	
	@Test
	public void onlyZero() {
		int[] nums = {0};
		int[] expected = {0};
		assertArrayEquals(ZeroMax.zeroMax(nums), expected);
	}

}
