import static org.junit.Assert.*;

import org.junit.Test;

public class FirstSwapTestCases {

	@Test
	public void simpleTest() {
		String[] strings = {"ab", "ac"};
		String[] result = {"ac", "ab"};
		assertArrayEquals(FirstSwap.firstSwap(strings),result);
	}
	
	@Test
	public void emptyTest() {
		String[] strings = {};
		String[] result = {};
		assertArrayEquals(FirstSwap.firstSwap(strings),result);
	}
	
	@Test
	public void wordsTest() {
		String[] strings = {"easy", "does", "it", "every", "ice", "eaten"};
		String[] result = {"every", "does", "ice", "easy", "it", "eaten"};
		assertArrayEquals(FirstSwap.firstSwap(strings),result);
	}
	
	@Test
	public void numbersTest() {
		String[] strings = {"4", "8", "15", "16", "23", "42"};
		String[] result = {"42", "8", "16", "15", "23", "4"};
		assertArrayEquals(FirstSwap.firstSwap(strings),result);
	}
	@Test
	public void noChangeTest() {
		String[] strings = {"a", "b", "c", "xx", "yy", "zz"};
		String[] result = {"a", "b", "c", "xx", "yy", "zz"};
		assertArrayEquals(FirstSwap.firstSwap(strings),result);
	}

}
