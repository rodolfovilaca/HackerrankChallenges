
/*Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
 * Return 0 for no numbers.
 */

public class Sum67 {
	public static int sum67(int[] nums) {
		int sum = 0;
		boolean flag = true;
		for (int num : nums) {
			if (num == 6) {
				flag = false;
			}
			if (flag) {
				sum += num;
			}
			if (num == 7) {
				flag = true;
			}
		}
		return sum;
	}
}
