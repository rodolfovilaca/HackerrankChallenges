package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise.MyMath;
import exercise.PerformOperation;

public class LambdaFunctionsTestCases {
	
	@Test
	public void isOddTrueTest() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isOdd();
		result = math.checker(po, 7);
		assertEquals(result,true);
	}
	
	@Test
	public void isOddFalseTest() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isOdd();
		result = math.checker(po, 2);
		assertEquals(result,false);
	}
	
	@Test
	public void isPrimeTrueTest() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isPrime();
		result = math.checker(po, 2);
		assertEquals(result,true);
	}
	
	@Test
	public void isPrimeHighNumber() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isPrime();
		result = math.checker(po, 9199);
		assertEquals(result,true);
	}
	
	@Test
	public void isPrimeFalseTest() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isPrime();
		result = math.checker(po, 14);
		assertEquals(result,false);
	}
	
	@Test
	public void isPalindromeTrueTest() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isPalindrome();
		result = math.checker(po, 2);
		assertEquals(result,true);
	}
	
	@Test
	public void isPalindromeHighNumber() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isPalindrome();
		result = math.checker(po, 113454311);
		assertEquals(result,true);
	}
	
	@Test
	public void isPalindromeFalseTest() {
		PerformOperation po;
		MyMath math = new MyMath();
		boolean result;
		po = math.isPalindrome();
		result = math.checker(po, 11331);
		assertEquals(result,false);
	}

}
