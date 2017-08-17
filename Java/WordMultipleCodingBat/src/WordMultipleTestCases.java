import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class WordMultipleTestCases {

	@Test
	public void groundZeroTest() {
		String[] strings = {};
		Map<String, Boolean> result = WordMultiple.wordMultiple(strings);
		String[] keyResults = new String[result.size()];
		Boolean[] valueResults = new Boolean[result.size()];
		String[] expectedKeys = {};
		Boolean[] expectedValues = {};
		int i = 0;
		for (Map.Entry<String, Boolean> entry : result.entrySet()) {
			keyResults[i] = entry.getKey();
			valueResults[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keyResults, expectedKeys);
		assertArrayEquals(valueResults, expectedValues);
	}

	@Test
	public void simpleTest() {
		String[] strings = { "a", "b", "a", "c", "b" };
		Map<String, Boolean> result = WordMultiple.wordMultiple(strings);
		String[] keyResults = new String[result.size()];
		Boolean[] valueResults = new Boolean[result.size()];
		String[] expectedKeys = { "a", "b", "c" };
		Boolean[] expectedValues = { true, true, false };
		int i = 0;
		for (Map.Entry<String, Boolean> entry : result.entrySet()) {
			keyResults[i] = entry.getKey();
			valueResults[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keyResults, expectedKeys);
		assertArrayEquals(valueResults, expectedValues);
	}

	@Test
	public void wordsTest() {
		String[] strings = { "this", "and", "this" };
		Map<String, Boolean> result = WordMultiple.wordMultiple(strings);
		String[] keyResults = new String[result.size()];
		Boolean[] valueResults = new Boolean[result.size()];
		String[] expectedKeys = { "and", "this" };
		Boolean[] expectedValues = { false, true };
		int i = 0;
		for (Map.Entry<String, Boolean> entry : result.entrySet()) {
			keyResults[i] = entry.getKey();
			valueResults[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keyResults, expectedKeys);
		assertArrayEquals(valueResults, expectedValues);
	}

	@Test
	public void lettersTest() {
		String[] strings = { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x" };
		Map<String, Boolean> result = WordMultiple.wordMultiple(strings);
		String[] keyResults = new String[result.size()];
		Boolean[] valueResults = new Boolean[result.size()];
		String[] expectedKeys = { "a", "b", "d", "e", "x", "z" };
		Boolean[] expectedValues = { true, true, true, false, false, true };
		int i = 0;
		for (Map.Entry<String, Boolean> entry : result.entrySet()) {
			keyResults[i] = entry.getKey();
			valueResults[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keyResults, expectedKeys);
		assertArrayEquals(valueResults, expectedValues);
	}

}
