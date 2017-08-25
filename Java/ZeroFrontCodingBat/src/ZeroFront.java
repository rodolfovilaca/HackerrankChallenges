
/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. 
 * The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 */
public class ZeroFront {
	public static  int[] zeroFront(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == 0) {
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
