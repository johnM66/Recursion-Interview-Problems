package com.recursive.pratice;

import java.util.Arrays;

public class BubbleSortUsingRecursion {

	public static void main(String[] args) {
		int[] arr = {8,4,78,96,10};
		bubbleSortUsingRecursin(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSortUsingRecursin(int[] arr,int r, int c) {
		if(r==0)
			return ;
		if(r>c) {
			if(arr[c]>arr[c+1]) {
				int temp = arr[c];
				arr[c] = arr[c+1];
				arr[c+1]=temp;
			}
			bubbleSortUsingRecursin(arr, r, c+1);
		}
		else
		{
			bubbleSortUsingRecursin(arr, r-1, 0);
		}
		
		
	}

}
