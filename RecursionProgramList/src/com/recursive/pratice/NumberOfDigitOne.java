package com.recursive.pratice;

public class NumberOfDigitOne {
	public static void main(String[] args) {
		int n = 159;
	
		 System.out.println(countOfDigitOne(n));
	}

	private static int countOfDigitOne(int n) {
		//base case
		if(n<=0)
			return 0;
		//hypothesis
		int count = 0;
		count+=countOfDigitOne(n-1);
		//induction
		String value = String.valueOf(n);
		count += value.split("1", -1) . length - 1;
			
		return count;
		// TODO Auto-generated method stub
		
	}
 
 
}
