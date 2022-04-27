package com.recursive.pratice;

public class PermutaionWithSpace {

	public static void main(String[] args) {
		String input="ABC";
		String output=String.valueOf(input.charAt(0));
				input=input.substring(1);
		solve(input,output);

	}

	private static void solve(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
		return;
	}
		//taking decision if need to take the value or not
		solve(input.substring(1), output+"-"+input.charAt(0));
		solve(input.substring(1),output+input.charAt(0));
	}

}
