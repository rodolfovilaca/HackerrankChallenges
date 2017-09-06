/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
*/
public class CountClumps {
	public static int countClumps(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (i > 0 && nums[i] == nums[i + 1] && nums[i] != nums[i - 1]) {
				count++;
			}
			if (i == 0 && nums[i] == nums[i + 1]) {
				count++;
			}
		}
		return count;
	}
}
