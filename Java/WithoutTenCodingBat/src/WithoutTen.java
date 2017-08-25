
/*Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, 
 * and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
 */

public class WithoutTen {
	public static int[] withoutTen(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) {
				nums[i] = 0;
				for (int j = nums.length - 1; j > i; j--) {
					if (nums[j] != 10 && nums[j] != 0) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		return nums;
	}
}
