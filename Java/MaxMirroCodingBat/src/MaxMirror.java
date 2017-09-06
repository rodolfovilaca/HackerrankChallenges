/*
 * 
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. 
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
 */
public class MaxMirror {
	public static int maxMirror(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = nums.length - 1; j >= 0 && count + i < nums.length; j--) {
				if (nums[j] == nums[i + count]) {
					count++;
				} else {
					max = Math.max(max, count);
					count = 0;
				}
			}
			max = Math.max(max, count);
		}
		return max;
	}
}
