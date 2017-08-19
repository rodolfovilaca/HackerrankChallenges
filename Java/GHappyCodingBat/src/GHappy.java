/*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. 
Return true if all the g's in the given string are happy.*/

public class GHappy {
	public static boolean gHappy(String str) {
		boolean flag = true;
		if (str.length() == 1) {
			flag = false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (i != str.length() - 1 && str.charAt(i) == 'g' && str.charAt(i + 1) == 'g') {
				flag = true;
			} else if (i != str.length() - 1 && str.charAt(i) == 'g' && str.charAt(i + 1) != 'g') {
				flag = false;
			}
			if (i != 0 && str.charAt(i) == 'g' && str.charAt(i - 1) == 'g') {
				flag = true;
			} else if (i != 0 && str.charAt(i) == 'g' && str.charAt(i - 1) != 'g') {
				flag = false;
			}
		}
		return flag;
	}
}
