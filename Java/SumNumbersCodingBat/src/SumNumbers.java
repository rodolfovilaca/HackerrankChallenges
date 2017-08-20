
/*Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row.
 *  (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 */
public class SumNumbers {
	public static int sumNumbers(String str) {
		int sum = 0;
		String regex = "[^0-9]";
		String[] arr = str.split(regex);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()>0){
				sum += Integer.parseInt(arr[i]);
			}
		}
		return sum;
	}
}
