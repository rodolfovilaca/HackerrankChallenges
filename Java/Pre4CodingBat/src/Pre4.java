
/*Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. 
 * The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 */
public class Pre4 {
	public static int[] pre4(int[] nums) {
		int position = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				position = i;
				break;
			}
		}
		int[] result = new int[position];
		if (position > 0) {
			for (int i = 0; i < position; i++) {
				result[i] = nums[i];
			}
		}
		return result;
	}
}
