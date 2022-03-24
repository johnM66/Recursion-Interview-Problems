package com.recursive.pratice;
/**
 * 
 * @author Manas
 *
 */
public class StringPalindromeUsingRecursion {

	public static void main(String[] args) {
		String str = "XYBYBYX";
		System.out.println(isPalindrome(str, 0, str.length() - 1));
	}

	private static boolean isPalindrome(String str, int low, int high) {
		// base case : if single character is present
		if (low >= high) {
			return true;
		}
		if (str.charAt(low) != str.charAt(high))
			return false;
		//hypothesis and inductions
		return isPalindrome(str, low + 1, high - 1);

	}
}
