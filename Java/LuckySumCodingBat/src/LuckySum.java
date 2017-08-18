//Given 3 int values, a b c, return their sum. However, 
//if one of the values is 13 then it does not count towards the sum and values to its right do not count. 
//So for example, if b is 13, then both b and c do not count.
public class LuckySum {
	public static int luckySum(int a, int b, int c) {
		int[] arr = { a, b, c };
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			if (arr[i] == 13) {
				return sum;
			}
			sum += arr[i];
		}
		return sum;
	}
}
