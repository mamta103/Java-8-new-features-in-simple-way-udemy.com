package com.durgasoft;


@FunctionalInterface
interface InterfBase05{
	public void square(int x);
}
public class TestWithLamda03 {
public static void main(String[] args) {
	InterfBase05 interfBase05 = x-> System.out.println("Multiply ::"+(x*x));
	interfBase05.square(100);
}
}
