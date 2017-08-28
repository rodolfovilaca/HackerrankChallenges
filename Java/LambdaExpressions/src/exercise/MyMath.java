package exercise;

public class MyMath {

	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return (n) -> {
			return n % 2 != 0 ? true : false;
		};
	}

	public PerformOperation isPrime() {
		return (n) -> {
			if (n != 2 && n % 2 == 0)
				return false;
			for (int i = 3; i < n; i += 2) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {
		return (n) -> {
			String str = String.valueOf(n);
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt((str.length() - 1) - i)) {
					return false;
				}
			}
			return true;
		};
	}
}
