package com.recursive.pratice;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int n = 10;
		int result = fact(n);
		System.out.println(result);

	}

	private static int fact(int n) {
		// base case
		if (n == 1)
			return 1;
		// hypothesis
		return n * fact(n - 1);
	}

}
