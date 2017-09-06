import static org.junit.Assert.*;

import org.junit.Test;

public class MaxMirrorTestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		assertEquals(MaxMirror.maxMirror(nums),0);
	}
	
	@Test
	public void simpleTest() {
		int[] nums = {1, 2, 1, 4};
		assertEquals(MaxMirror.maxMirror(nums),3);
	}
	
	@Test
	public void complexTest() {
		int[] nums = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
		assertEquals(MaxMirror.maxMirror(nums),4);
	}
	
	@Test
	public void notTheXtremes() {
		int[] nums = {5, 9, 9, 4, 5, 4, 9, 9, 2};
		assertEquals(MaxMirror.maxMirror(nums),7);
	}
	
	@Test
	public void palindromeArray() {
		int[] nums = {1, 2, 3, 2, 1};
		assertEquals(MaxMirror.maxMirror(nums),5);
	}

}
