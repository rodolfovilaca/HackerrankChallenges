
/*Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. 
 * The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 */
public class Post4 {
	public static int[] post4(int[] nums) {
		int position = 0;
		if (nums.length > 0) {
			for (int i = nums.length - 1; i < nums.length; i--) {
				if (nums[i] == 4) {
					position = i + 1;
					break;
				}
			}
		}
		int[] result = new int[nums.length - position];
		for (int i = 0; i < nums.length - position; i++) {
			result[i] = nums[position + i];
		}
		return result;
	}
}
