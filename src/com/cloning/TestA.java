package com.cloning;

public class TestA  implements Cloneable{
	int i;
	int j;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	@Override
	public String toString() {
		return "TestA [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
       
		TestA a= new TestA();
		a.i=10;
		a.j=11;
		
		
		TestA a4=(TestA) a.clone();
		System.out.println("a4 ::"+a4);
		
	}

}
