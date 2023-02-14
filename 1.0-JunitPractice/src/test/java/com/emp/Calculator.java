package com.emp;

public class Calculator {

	public int doSum(int a, int b, int c) {
		return a + b + c;
	}

	public String concatString(String fname, String lname) {
		return fname + " " + lname;
	}

	public boolean isNameEmpty(String name) {
		return name.isEmpty();
	}

	public int addArrayElements(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public boolean arrayElementAbove20(int arr[]) {
		boolean res = false;
		for (int i : arr) {
			if (i > 20) {
				res = true;
				break;
			} else {
				res = false;
			}
		}
		return res;
	}
}
