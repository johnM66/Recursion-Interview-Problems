package com.recursive.pratice;

public class ProductOfNumbersUsingRecursion {

	public static void main(String[] args) {
		int n = 65;
		System.out.println(productOfNumbers(n));
	}

	private static int productOfNumbers(int n) {
		// base case
		if (n == 0)
			return 1;
		int rem = n % 10;
		int div = n / 10;
		// induction and hypothesis
		return rem * productOfNumbers(div);

	}

}
