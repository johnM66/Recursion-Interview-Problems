package com.recursive.pratice;

/*
 * sum of numbers using recursion
 */
public class SumOfNumbersUsingRecursion {

	public static void main(String[] args) {
		int n=10;
		System.out.println(sumofNumbers(n));

	}

	private static int sumofNumbers(int n) {
		//base case 
		if(n==1 || n==0)
			return n;
		//induction and hypothesis
		
		return n+sumofNumbers(n-1);
				
	}

}
