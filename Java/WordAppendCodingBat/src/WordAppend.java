
//Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
//Return the empty string if no string appears a 2nd time.

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
	public static String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			if (map.containsKey(strings[i])) {
				map.put(strings[i], map.get(strings[i]) + 1);
				if (map.get(strings[i]) / 2 > 0) {
					result += strings[i];
				}
				map.remove(strings[i]);
			} else {
				map.put(strings[i], 1);
			}
		}
		return result;
	}
}
