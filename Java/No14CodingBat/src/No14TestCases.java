import static org.junit.Assert.*;

import org.junit.Test;

public class No14TestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		assertEquals(No14.no14(nums), true);
	}
	@Test
	public void simpleTrueTest() {
		int[] nums = {1, 2, 3};
		assertEquals(No14.no14(nums), true);
	}
	@Test
	public void simpleFalseTest() {
		int[] nums = {1, 2, 3, 4};
		assertEquals(No14.no14(nums), false);
	}
	@Test
	public void onlyOnesTest() {
		int[] nums = {1, 1, 1, 1};
		assertEquals(No14.no14(nums), true);
	}
	@Test
	public void twoFoursTest() {
		int[] nums = {9, 4, 4, 1};
		assertEquals(No14.no14(nums), false);
	}

}
