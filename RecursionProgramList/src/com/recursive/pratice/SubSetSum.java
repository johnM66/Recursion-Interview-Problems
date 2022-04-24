package com.recursive.pratice;

public class SubSetSum {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 15, 2, 11 };
		int targetSum = 15;
		int sos = 0;
		subsetsum(arr, 0, targetSum, sos, "");

	}

	private static void subsetsum(int[] arr, int index, int targetSum, int sos, String set) {
		if (index == arr.length) {
			if (targetSum == sos) {
				System.out.println(set);
				
			}
			return;

		}
		subsetsum(arr, index + 1, targetSum, sos + arr[index], set + arr[index] + ",");
		subsetsum(arr, index + 1, targetSum, sos, set);
		

	}

}
