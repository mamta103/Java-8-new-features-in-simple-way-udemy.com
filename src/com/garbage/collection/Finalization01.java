package com.garbage.collection;

public class Finalization01 {

	public static void main(String[] args) {

		String s1= new String("Lussy");
		s1= null;
		System.gc();
		System.out.println("End of main method:: ");
		
	}

	public void finalize(){
		System.out.println("Finalize method called::");
	}
}
