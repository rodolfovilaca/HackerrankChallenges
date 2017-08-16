import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class WordCountTestCases {

	@Test
	public void simpleTest() {
		String[] strings = { "a", "b", "a", "c", "b" };
		Map<String, Integer> exepcted = WordCount.wordCount(strings);
		int[] values = new int[exepcted.size()];
		String[] keys = new String[exepcted.size()];
		int[] expectedValues = { 2, 2, 1 };
		String[] expectedStrings = { "a", "b", "c" };
		int i = 0;
		for (Map.Entry<String, Integer> entry : exepcted.entrySet()) {
			values[i] = entry.getValue();
			keys[i] = entry.getKey();
			i++;
		}
		assertArrayEquals(values, expectedValues);
		assertArrayEquals(keys, expectedStrings);
	}

	@Test
	public void complexTest() {
		String[] strings = { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two",
				"b", "one", "two" };
		Map<String, Integer> exepcted = WordCount.wordCount(strings);
		int[] values = new int[exepcted.size()];
		String[] keys = new String[exepcted.size()];
		int[] expectedValues = { 4, 5, 3, 1, 1, 1, 2, 2, 2 };
		String[] expectedStrings = { "a", "b", "d", "e", "f", "one", "x", "z", "two" };
		int i = 0;
		for (Map.Entry<String, Integer> entry : exepcted.entrySet()) {
			values[i] = entry.getValue();
			keys[i] = entry.getKey();
			i++;
		}
		assertArrayEquals(values, expectedValues);
		assertArrayEquals(keys, expectedStrings);
	}

	@Test
	public void zeroTest() {
		String[] strings = {};
		Map<String, Integer> exepcted = WordCount.wordCount(strings);
		int[] values = new int[exepcted.size()];
		String[] keys = new String[exepcted.size()];
		int[] expectedValues = {};
		String[] expectedStrings = {};
		int i = 0;
		for (Map.Entry<String, Integer> entry : exepcted.entrySet()) {
			values[i] = entry.getValue();
			keys[i] = entry.getKey();
			i++;
		}
		assertArrayEquals(values, expectedValues);
		assertArrayEquals(keys, expectedStrings);
	}
}
