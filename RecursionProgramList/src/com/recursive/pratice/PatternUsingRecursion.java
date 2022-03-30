package com.recursive.pratice;

public class PatternUsingRecursion {

	public static void main(String[] args) {
		int row =5;
		int column = 0;
		patternPrinting(row);
		

	}

	private static void alternativePattern(int row, int column) {
		if(row==0)
		return;
		if(row>column) {
			alternativePattern(row, column+1);
			System.out.print("*");
		
		}
		else {
			alternativePattern(row-1, 0);
			System.out.println();
			
		}
	}
	
	

	private static void patternPrinting(int n) {
		//recursion can be done either we have decision+choice or IBH method
		if(n==0)
			return;
		//hypothesis
		patternPrinting(n-1);
		//Induction
		for(int i =1;i<=n;i++)
			System.out.print("*");
		System.out.println();
		/*//hypothesis
		patternPrinting(n-1);*/
		
	}

}
