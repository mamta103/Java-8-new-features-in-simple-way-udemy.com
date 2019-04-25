package com.durgasoft;

@FunctionalInterface
interface InterfBase02 {
	public void m1();

}

public class TestWithLamda01 {
	public static void main(String[] args) {
		InterfBase02 interfBase02 = () -> System.out.println("MethodOne Execution");
	}
}
