package com.recursive.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArray {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 41, 25, 6 };
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);list.add(2);list.add(41);list.add(25);
		list.add(6);
		System.out.println(list.size()-1);
		sortingArrayUsingRecursion(list);
		System.out.println(list);
	}

	private static void sortingArrayUsingRecursion(List<Integer> list) {

		//base case
		if(list.size()<=1)
			return;
		//design hypothesis
		int val = (int) list.get(list.size()-1);
		list.remove(list.get(list.size()-1));
		sortingArrayUsingRecursion(list);
		//design induction
		insertElement(list,val);
		
	}

	private static void insertElement(List<Integer> list, int val) {
		//base case
		if(list.size()==0 || (list.get((list.size()-1))<=val)) {
			list.add(val);
			return;
		}
		//design hypothesis
		int temp=list.get(list.size()-1);
		list.remove(list.get(list.size()-1));
		//hypothesis
		insertElement(list, val);
		//Induction
		list.add(temp);
			
		
	}
}
