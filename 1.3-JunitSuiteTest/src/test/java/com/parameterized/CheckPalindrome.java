package com.parameterized;

public class CheckPalindrome {
	
	public static boolean isWordPalindrome(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}

}
