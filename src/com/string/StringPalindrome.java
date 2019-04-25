package com.string;

public class StringPalindrome {

	public static void main(String[] args) {

		String originalString = "abcdcba";
		StringBuilder sb = new StringBuilder(originalString);

		String reverseString = sb.reverse().toString();
		boolean isPalindrame = originalString.equals(reverseString);
		System.out.println(isPalindrame);

	}

}
