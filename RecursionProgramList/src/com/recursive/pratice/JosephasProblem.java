package com.recursive.pratice;

import java.util.ArrayList;
import java.util.List;

class JosephasProblem {
	public static void main(String[] args) {

		int findTheWinner = findTheWinner(10, 2);
		System.out.println(findTheWinner);
	}

	public static int findTheWinner(int n, int k) {

		k--; // (k-1)th person will be killed
		int index = 0; // The index where the person which will die

		List<Integer> person = new ArrayList<>();

		// fill the person vector
		for (int i = 1; i <= n; i++) {
			person.add(i);
		}

		return josh(person, k, index);
	}

	static int josh(List<Integer> person, int k, int index) {
		if (person.size() == 1)

			return person.get(0);

		index = ((index + k) % person.size());

		// remove the first person which is going to be killed
		person.remove(index);

		// recursive call for n-1 persons
		return josh(person, k, index);
	}
}