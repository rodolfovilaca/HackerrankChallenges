import static org.junit.Assert.*;

import org.junit.Test;

public class Post4TestCases {

	@Test
	public void groundZeroTest() {
		int[] nums = {};
		int[] expected = {};
		assertArrayEquals(Post4.post4(nums), expected);
	}

	@Test
	public void simpleTest() {
		int[] nums = { 2, 4, 1, 2 };
		int[] expected = { 1, 2 };
		assertArrayEquals(Post4.post4(nums), expected);
	}

	@Test
	public void startFour() {
		int[] nums = { 4, 4, 1, 2, 3 };
		int[] expected = { 1, 2, 3 };
		assertArrayEquals(Post4.post4(nums), expected);
	}

	@Test
	public void onlyFours() {
		int[] nums = { 4, 4, 4, 4, 4 };
		int[] expected = {};
		assertArrayEquals(Post4.post4(nums), expected);
	}

}
