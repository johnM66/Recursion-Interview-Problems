package com.recursive.pratice;

public class ReverseNumberUsingRecursion {
	static int rem = 0;
	static int temp = 0;
	public static void main(String[] args) {
		int number = 5696;
		// reverse number is 8965
		int digits = (int) Math.log10(number)+1;
		System.out.println(reverseNumber(number));
		System.out.println(alternativeApproach(number,digits));

	}

	private static int alternativeApproach(int number, int digits) {
		// base case
		if (number % 10 == number)
			return number;
			int rem = number%10;
			//hypothesis and induction
		return rem * (int)(Math.pow(10, digits-1)) + alternativeApproach(number / 10,digits-1);

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
