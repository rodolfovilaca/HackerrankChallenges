
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
