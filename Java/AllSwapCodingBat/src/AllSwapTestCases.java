import static org.junit.Assert.*;

import org.junit.Test;

public class AllSwapTestCases {

	@Test
	public void groundZeroTest() {
		String[] strings = {};
		String[] expected = {};
		assertArrayEquals(AllSwap.allSwap(strings),expected);
	}
	@Test
	public void simpleTest() {
		String[] strings = {"ab", "ac"};
		String[] expected = {"ac", "ab"};
		assertArrayEquals(AllSwap.allSwap(strings),expected);
	}
	@Test
	public void wordsTest() {
		String[] strings = {"list", "of", "words", "swims", "over", "lily", "water", "wait"};
		String[] expected = {"lily", "over", "water", "swims", "of", "list", "words", "wait"};
		assertArrayEquals(AllSwap.allSwap(strings),expected);
	}
	@Test
	public void numbersTest() {
		String[] strings = {"4", "8", "15", "16", "23", "42"};
		String[] expected = {"42", "8", "16", "15", "23", "4"};
		assertArrayEquals(AllSwap.allSwap(strings),expected);
	}

}
