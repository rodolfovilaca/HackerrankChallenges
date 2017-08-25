import static org.junit.Assert.*;

import org.junit.Test;

public class NotAloneTestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		int[] expected = {};
		assertArrayEquals(NotAlone.notAlone(nums, 3), expected);
	}
	
	@Test
	public void simpleTest() {
		int[] nums = {1, 2, 3};
		int[] expected = {1, 3, 3};
		assertArrayEquals(NotAlone.notAlone(nums, 2), expected);
	}
	
	@Test
	public void noChangeTest() {
		int[] nums = {1, 1, 1};
		int[] expected = {1, 1, 1};
		assertArrayEquals(NotAlone.notAlone(nums, 1), expected);
	}
	
	@Test
	public void complexTest() {
		int[] nums = {1, 3, 1, 2};
		int[] expected = {1, 3, 3, 2};
		assertArrayEquals(NotAlone.notAlone(nums, 1), expected);
	}
}
