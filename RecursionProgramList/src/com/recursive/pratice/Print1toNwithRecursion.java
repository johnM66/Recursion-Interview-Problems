package com.recursive.pratice;

public class Print1toNwithRecursion {
	public static void main(String[] args) {
		int n = 10;
		print1ToNwithRecursion(n);
	}

	private static void print1ToNwithRecursion(int n) {
		// base case if number is equal to zero.
		if (n == 0)
			return;
		// hypothesis term
		print1ToNwithRecursion(n - 1);
		// induction
		System.out.println(n);

	}
}
