//Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, 
//and the value is that string's length.

import java.util.HashMap;
import java.util.Map;

public class WordLen {
	public static Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			result.put(strings[i], strings[i].length());
		}
		return result;
	}
}
