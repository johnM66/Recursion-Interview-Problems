package com.recursive.pratice;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Manas
 *
 */
public class PrintSubSets {
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		String sub="abc";
		String output = "";
		solve(sub, output);
		System.out.println(list);
		

	}

	private static void solve(String sub, String output) {
		if(sub.length()==0) {
			list.add(output);
		return;
		}
		
		solve(sub.substring(1), output+sub.charAt(0));
		solve(sub.substring(1),output);
		
	}

}
