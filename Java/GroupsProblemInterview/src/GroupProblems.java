
public class GroupProblems {
	public static int numberOfFields(boolean[][] farm) {
		int columnSize = farm[0].length;
		int rowSize = farm.length;
		int numberOfFields = 0;
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				if (farm[i][j] == true) {
					numberOfFields++;
					if (j != 0 && farm[i][j - 1] == true) {
						numberOfFields--;
					}
					if (i != 0 && farm[i - 1][j] == true) {
						numberOfFields--;
					}
				}
			}
		}
		return numberOfFields;
	}
}
