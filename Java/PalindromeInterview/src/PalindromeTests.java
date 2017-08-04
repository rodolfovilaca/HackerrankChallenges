import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTests {
	@Test
	public void testIfPalindrome() {
		assertEquals(Palindrome.isPalindrome("ABBA"), true);
		assertEquals(Palindrome.isPalindrome("Rodolfo"), false);
		assertEquals(Palindrome.isPalindrome(""), false);
		assertEquals(Palindrome.isPalindrome("A"), false);
		assertEquals(Palindrome.isPalindrome("BB"), true);
		assertEquals(Palindrome.isPalindrome("aBBA"),false);
		assertEquals(Palindrome.isPalindrome("aBBa"),true);
		assertEquals(Palindrome.isPalindrome(null),false);
	}
}