import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class FirstCharTestCases {

	@Test
	public void groundZeroTest() {
		String[] strings = {};
		Map<String, String> expected = FirstChar.firstChar(strings);
		String[] keys = new String[expected.size()];
		String[] values = new String[expected.size()];
		String[] expectedKeys = {};
		String[] expectedValues = {};
		int i = 0;
		for (Map.Entry<String, String> entry : expected.entrySet()) {
			keys[i] = entry.getKey();
			values[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keys, expectedKeys);
		assertArrayEquals(values, expectedValues);
	}

	@Test
	public void simpleTest() {
		String[] strings = { "salt", "tea", "soda", "toast" };
		Map<String, String> expected = FirstChar.firstChar(strings);
		String[] keys = new String[expected.size()];
		String[] values = new String[expected.size()];
		String[] expectedKeys = { "s", "t" };
		String[] expectedValues = { "saltsoda", "teatoast" };
		int i = 0;
		for (Map.Entry<String, String> entry : expected.entrySet()) {
			keys[i] = entry.getKey();
			values[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keys, expectedKeys);
		assertArrayEquals(values, expectedValues);
	}

	@Test
	public void complexTest() {
		String[] strings = { "apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells" };
		Map<String, String> expected = FirstChar.firstChar(strings);
		String[] keys = new String[expected.size()];
		String[] values = new String[expected.size()];
		String[] expectedKeys = { "a", "b", "s", "z" };
		String[] expectedValues = { "appleaardvark", "bellsbellsbells", "saltsun", "zen" };
		int i = 0;
		for (Map.Entry<String, String> entry : expected.entrySet()) {
			keys[i] = entry.getKey();
			values[i] = entry.getValue();
			i++;
		}
		assertArrayEquals(keys, expectedKeys);
		assertArrayEquals(values, expectedValues);
	}

}
