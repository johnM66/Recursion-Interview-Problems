package com.recursive.pratice;

public class SelectionSortUsingRecursion {
	public static void main(String[] args) {
		int[] arr = {8,4,78,96,10};
		selectionSorting(arr,arr.length-1,0,0);
	}

	private static void selectionSorting(int[] arr, int r, int c, int max) {

		if(r==0)
			return;
		if(r>c) {
			if(arr[c]>arr[max]) {
				selectionSorting(arr, r, c+1, c);
			}
			else {
				selectionSorting(arr, r, c+1, max);
			}
		}
		
	}
}
