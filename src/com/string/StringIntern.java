package com.string;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = new String("ABC");// goes to Heap Memory, like other objects
		String s2 = "ABC";// goes to String Pool
		String s3 = "ABC"; // again, goes to String Pool
		// Let's check out above theories by checking references
		System.out.println("s1==s2? " + (s1 == s2));
		System.out.println("s2==s3? " + (s2 == s3));

		// Let's call intern() method on s1 now
		s1 = s1.intern();
		// this should return the String with same value, BUT from String Pool
		// Let's run the test again

		System.out.println("s1==s2? " + (s1 == s2));// should be true now

	}

}
