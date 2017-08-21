import static org.junit.Assert.*;

import org.junit.Test;

public class IsEverywhereTestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		assertEquals(IsEverywhere.isEverywhere(nums,1), true);
	}
	
	@Test
	public void simpleTrueTest() {
		int[] nums = {1, 2, 1, 3};
		assertEquals(IsEverywhere.isEverywhere(nums,1), true);
	}
	
	@Test
	public void simpleFalseTest() {
		int[] nums = {1, 2, 1, 3};
		assertEquals(IsEverywhere.isEverywhere(nums,2), false);
	}
	
	@Test
	public void almostTrueTest() {
		int[] nums = {2, 1, 2, 2, 2, 1, 1, 2};
		assertEquals(IsEverywhere.isEverywhere(nums,2), false);
	}
	
	@Test
	public void smallTrueTest() {
		int[] nums = {3};
		assertEquals(IsEverywhere.isEverywhere(nums,3), true);
	}
	
	@Test
	public void smallFalseTest() {
		int[] nums = {3};
		assertEquals(IsEverywhere.isEverywhere(nums,0), true);
	}
}
