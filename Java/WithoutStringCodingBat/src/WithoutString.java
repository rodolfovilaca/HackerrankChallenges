/*Given two strings, base and remove, return a version of the base string where all instances of the remove string have 
been removed (not case sensitive). You may assume that the remove string is length 1 or more. 
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".*/
public class WithoutString {
	public static String withoutString(String base, String remove) {
		String REGEX = "(?i)" + remove;
		String[] resultArr = base.split(REGEX);
		String result = "";
		for (String word : resultArr) {
			result += word;
		}
		return result;
	}

}
