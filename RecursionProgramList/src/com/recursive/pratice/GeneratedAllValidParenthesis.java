package com.recursive.pratice;

public class GeneratedAllValidParenthesis {

	public static void main(String[] args) {
		int n = 3;
		int open = 3, close = 3;
		solve(open, close, "");

	}

	private static void solve(int open, int close, String output) {
		if (open == 0 && close == 0) {
			System.out.println(output);
			return;
		}
		if (open != 0) {
			solve(open - 1, close, output + "(");
		}
		if (close > open) {
			solve(open, close - 1, output + ")");
		}

	}

}
