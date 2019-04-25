package com.cloning;

public class Cloing {
/*
 * Shallow
 * Deep
 * Cloing
 */
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.i = 90;
		abc.j = 100;
		System.out.println("abc:: "+abc);
		ABC abc2 = abc;
		System.out.println("abc2 ::"+abc2);
		abc2.i=99;
		System.out.println("abc2 ::"+abc2);



	}

}
