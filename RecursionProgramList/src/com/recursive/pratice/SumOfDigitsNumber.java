package com.recursive.pratice;

public class SumOfDigitsNumber {

	public static void main(String[] args) {
		int n = 65;
		System.out.println(sumofDigit(n));

	}

	private static int sumofDigit(int n) {
		// base case
		if (n == 1 || n == 0)
			return n;
		int rem = n % 10;
		int div = n / 10;
		//induction and hypothesis
		return rem + sumofDigit(div);

	}
}
