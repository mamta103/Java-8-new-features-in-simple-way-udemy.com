package com.durgasoft;

@FunctionalInterface
interface InterfBase04{
	public void sum(int i,int j);
}
public class TestWithLamda02 {
public static void main(String[] args) {
	InterfBase04 interfBase04= (a,b) -> System.out.println("Sum ::"+(a+b));
	interfBase04.sum(80, 80);
}
}
