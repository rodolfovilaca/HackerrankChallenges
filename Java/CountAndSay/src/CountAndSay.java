public class CountAndSay {
	public static String valueNth(int n) {
		String result = "1";
		for (int i = 0; i < n-1; i++) {
			int count = 0;
			count++;
			String temp = "";
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					temp += count;
					temp += result.charAt(j-1);
					count = 1;
				}
			}
			temp+= count;
			temp+= result.charAt(result.length()-1);
			result = temp;
		}
		System.out.print(result);
		return result;
	}
}
