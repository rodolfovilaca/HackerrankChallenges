
/*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. 
 * If there is no odd value to the right of the zero, leave the zero as a zero.
 */
public class ZeroMax {
	public static int[] zeroMax(int[] nums) {
		int tempMax = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] % 2 == 1 && nums[j] > tempMax) {
						tempMax = nums[j];
					}
				}
				nums[i] = tempMax;
				tempMax = 0;
			}
		}
		return nums;
	}
}
