/*Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
 *  For example, sameEnds("abXab") is "ab".
 */
public class SameEnds {
	public static String sameEnds(String string) {
		String result = "";
		String front = "";
		String end = "";
		if (string.length() < 2) {
			return result;
		}
		if (string.length() % 2 == 0) {
			front += string.substring(0, string.length() / 2);
			end += string.substring(string.length() / 2);
		} else {
			front += string.substring(0, string.length() / 2);
			end += string.substring(string.length() / 2 + 1);
		}
		for (int i = 0; i < front.length(); i++) {
			if (front.substring(0, front.length() - i).equals(end.substring(i))) {
				result += end.substring(i);
				return result;
			}
		}
		return result;
	}
}
