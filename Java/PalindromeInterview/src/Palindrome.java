//Case Sensitive
//Strings não nulas e > 1 caractere
//
public class Palindrome {
	public static boolean isPalindrome(String word) {
		if(word == null || word.length() < 2){
			return false;
		}
		for(int i=0; i<word.length()/2;i++){
			if(word.charAt(i) != word.charAt((word.length()-1)-i)){
				return false;
			}
		}
		return true;
	}
}