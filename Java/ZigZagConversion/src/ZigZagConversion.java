
public class ZigZagConversion {
	public static String covnert(String word, int nRows) {
		if (nRows <= 1) {
			return word;
		}
		String result = "";
		int jump = (2 * nRows) - 2;
		int wordSize = word.length();
		for (int i = 0; i < nRows; i++) {
			for (int j = i; j < wordSize; j++) {
				if(jump != 0)
					result+=word.charAt(j);
				j += jump;
				if (i != 0 && j < wordSize)
					result+=word.charAt(j);
				j += (2*i);
				j--;
			}
			jump -=2;
		}
		System.out.println(result);
		return result;
	}
}
