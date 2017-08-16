import static org.junit.Assert.*;

import org.junit.Test;

public class MaxTripleTestCases {

	@Test
	public void testOne() {
		int[] nums = {1,2,3};
		assertEquals(MaxTriple.maxTriple(nums),3);
	}
	@Test
	public void testTwo() {
		int[] nums = {1, 5, 3};
		assertEquals(MaxTriple.maxTriple(nums),5);
	}
	@Test
	public void testThree() {
		int[] nums = {5, 2, 3};
		assertEquals(MaxTriple.maxTriple(nums),5);
	}
	@Test
	public void testFour() {
		int[] nums = {1, 2, 3, 1, 1};
		assertEquals(MaxTriple.maxTriple(nums),3);
	}
	@Test
	public void testFive() {
		int[] nums = {1, 7, 3, 1, 5};
		assertEquals(MaxTriple.maxTriple(nums),5);
	}
	@Test
	public void testSix() {
		int[] nums = {5, 1, 3, 7, 1};
		assertEquals(MaxTriple.maxTriple(nums),5);
	}
	@Test
	public void testSeven() {
		int[] nums = {5, 1, 7, 3, 7, 8, 1};
		assertEquals(MaxTriple.maxTriple(nums),5);
	}	
	@Test
	public void testEigth() {
		int[] nums = {5, 1, 7, 9, 7, 8, 1};
		assertEquals(MaxTriple.maxTriple(nums),9);
	}

}
