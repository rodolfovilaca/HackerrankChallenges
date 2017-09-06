import static org.junit.Assert.*;

import org.junit.Test;

public class CountClumpsTestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		assertEquals(CountClumps.countClumps(nums),0);
	}
	
	@Test
	public void simpleTest() {
		int[] nums = {1, 2, 3};
		assertEquals(CountClumps.countClumps(nums),0);
	}

	
	@Test
	public void complexTest() {
		int[] nums = {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
		assertEquals(CountClumps.countClumps(nums),5);
	}

	
	@Test
	public void onlyOnes() {
		int[] nums = {1, 1, 1, 1, 1};
		assertEquals(CountClumps.countClumps(nums),1);
	}


}
