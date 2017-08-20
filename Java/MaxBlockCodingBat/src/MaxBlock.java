
/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
 * 
 */
public class MaxBlock {
	public static int maxBlock(String str) {
		int max = 1;
		int temp = 1;
		if (str.length() < 1) {
			return 0;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				temp = 1;
			} else {
				temp++;
				if (temp > max) {
					max = temp;
				}
			}
		}
		return max;
	}
}
