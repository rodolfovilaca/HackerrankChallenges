/*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
 *  The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
 *   (Note: Character.isLetter(char) tests if a char is a letter.)
 */
public class IsNot {
	public static String notReplace(String str) {
		String regex = "[a-zA-Z]";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.equals("is")) {
				result += "is not";
				i++;
			} else if (i > 0 && i < str.length() - 2 && str.substring(i, i + 2).equals("is")
					&& !str.substring(i - 1, i).matches(regex) && !str.substring(i + 2, i + 3).matches(regex)) {
				result += "is not";
				i++;
			} else if (i == 0 && str.substring(i, i + 2).equals("is") && !str.substring(i + 2, i + 3).matches(regex)) {
				result += "is not";
				i++;
			} else if (i == str.length() - 2 && str.substring(i, i + 2).equals("is")
					&& !str.substring(i - 1, i).matches(regex)) {
				result += "is not";
				i++;
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
