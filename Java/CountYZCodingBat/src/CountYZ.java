/*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). 
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)*/

public class CountYZ {
	public static int countYZ(String str) {
		String REGEX = "[^a-zA-Z]";
		String[] words = str.split(REGEX);
		int count = 0;
		for (String word : words) {
			if (word.length() > 0) {
				if (word.substring(word.length() - 1).matches("[yY]")
						|| word.substring(word.length() - 1).matches("[zZ]")) {
					count++;
				}
			}
		}
		return count;
	}
}
