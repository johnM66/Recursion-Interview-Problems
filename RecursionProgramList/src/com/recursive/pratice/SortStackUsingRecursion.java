package com.recursive.pratice;

import java.util.Stack;
/**
 * 
 * @author Manas
 *
 */
public class SortStackUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(12);
		stack.push(100);
		stack.push(250);
		stack.push(45);
		stack.push(8);
		stack.push(99);
		sortStackUsingRecursion(stack);

	}

	private static void sortStackUsingRecursion(Stack<Integer> stack) {
		//base case
		if(stack.size()<=1)
			return;
		//hypothesis
		int value = stack.peek();
		stack.pop();
		sortStackUsingRecursion(stack);
		//Induction steps
		insertIntoStackAgain(stack,value);

   
	}

	private static void insertIntoStackAgain(Stack<Integer> stack, int value) {
		//base case
		if(stack.size()==0 || stack.peek()<=value) {
			stack.push(value);
			return;
		}
		//design hypothesis
		int temp = stack.peek();
		stack.pop();
		insertIntoStackAgain(stack, value);
		//Induction Steps
		stack.push(temp);
		
	}

}
