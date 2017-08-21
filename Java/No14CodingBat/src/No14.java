
//Given an array of ints, return true if it contains no 1's or it contains no 4's.
public class No14 {
	public static boolean no14(int[] nums) {
		boolean flag1 = false;
		boolean flag4 = false;
		for (int num : nums) {
			if (num == 1) {
				flag1 = true;
			}
			if (num == 4) {
				flag4 = true;
			}
			if (flag1 && flag4) {
				return false;
			}
		}
		return true;
	}
}
