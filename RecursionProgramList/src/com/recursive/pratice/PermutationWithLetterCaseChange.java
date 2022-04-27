package com.recursive.pratice;

public class PermutationWithLetterCaseChange {

	public static void main(String[] args) {
		String input="A1b2";
		String output="";
				
		solve(input,output);

	}

	private static void solve(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
		return;
	}
		//taking decision if need to take the value or not
		if(!input.matches("[0-9]+")) {
		solve(input.substring(1), output+String.valueOf(input.charAt(0)).toUpperCase());
		solve(input.substring(1),output+String.valueOf(input.charAt(0)).toLowerCase());
		}
		else {
			solve(input.substring(1), output+String.valueOf(input.charAt(0)));
		}
	}
}
