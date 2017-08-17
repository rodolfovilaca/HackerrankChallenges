import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class WordLenTestCases {

	@Test
	public void groundZeroTest() {
		String[] strings = {};
		Map<String, Integer> result = WordLen.wordLen(strings);
		String[] keyResults = new String[result.size()];
		Integer[] valueResults = new Integer[result.size()];
		String[] expectedKeys = {};
		Integer[] expectedValues = {};
		int i = 0;
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			keyResults[i] = entry.getKey();
			valueResults[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keyResults, expectedKeys);
		assertArrayEquals(valueResults, expectedValues);
	}

	@Test
	public void simpleTest() {
		String[] strings = { "a", "bb", "a", "bb" };
		Map<String, Integer> result = WordLen.wordLen(strings);
		String[] keyResults = new String[result.size()];
		Integer[] valueResults = new Integer[result.size()];
		String[] expectedKeys = { "bb", "a" };
		Integer[] expectedValues = { 2, 1 };
		int i = 0;
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			keyResults[i] = entry.getKey();
			valueResults[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keyResults, expectedKeys);
		assertArrayEquals(valueResults, expectedValues);
	}

	@Test
	public void wordsTest() {
		String[] strings = { "code", "code", "code", "bug" };
		Map<String, Integer> result = WordLen.wordLen(strings);
		String[] keyResults = new String[result.size()];
		Integer[] valueResults = new Integer[result.size()];
		String[] expectedKeys = { "code", "bug" };
		Integer[] expectedValues = { 4, 3 };
		int i = 0;
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			keyResults[i] = entry.getKey();
			valueResults[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keyResults, expectedKeys);
		assertArrayEquals(valueResults, expectedValues);
	}

}
