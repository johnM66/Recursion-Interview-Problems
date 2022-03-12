package com.recursive.pratice;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		
		for (int i=0; i< n;i++) {
			System.out.print(fib(i)+" ");
		}
		

	}

	private static int fib(int n) {
		// base case
		if (n <= 1) {
			return n;
		}
		return fib(n - 2) + fib(n - 1);

	}

}
