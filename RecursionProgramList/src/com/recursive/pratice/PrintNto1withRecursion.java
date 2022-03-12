package com.recursive.pratice;

public class PrintNto1withRecursion {
	public static void main(String[] args) {
		int n = 10;
		print1ToNwithRecursion(n);
	}

	private static void print1ToNwithRecursion(int n) {
		// base case if number is equal to zero.
		if (n == 0)
			return;
		// induction term
		System.out.println(n);
		// hypothesis term
		print1ToNwithRecursion(n - 1);

	}
}
