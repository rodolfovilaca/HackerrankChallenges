import static org.junit.Assert.*;

import org.junit.Test;

public class Pre4TestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		int[] expected = {};
		assertArrayEquals(Pre4.pre4(nums), expected);
	}
	
	@Test
	public void simpleTest() {
		int[] nums = {3, 1, 4,5};
		int[] expected = {3,1};
		assertArrayEquals(Pre4.pre4(nums), expected);
	}
	
	@Test
	public void onlyFours() {
		int[] nums = {4, 4};
		int[] expected = {};
		assertArrayEquals(Pre4.pre4(nums), expected);
	}
	
	@Test
	public void lastFour() {
		int[] nums = {1, 2, 1, 4};
		int[] expected = {1,2,1};
		assertArrayEquals(Pre4.pre4(nums), expected);
	}

}
