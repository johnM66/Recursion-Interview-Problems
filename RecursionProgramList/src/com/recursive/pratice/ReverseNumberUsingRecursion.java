package com.recursive.pratice;

public class ReverseNumberUsingRecursion {
	static int rem = 0;
	static int temp = 0;
	public static void main(String[] args) {
		int number = 5696;
		// reverse number is 8965
		System.out.println(reverseNumber(number));

	}

	private static int reverseNumber(int number) {
		// base case
		if (number > 0) {
			
		temp = temp * 10 +number % 10;
		int div = number / 10;
		reverseNumber(div);
	}
		return temp ;

	}

}
