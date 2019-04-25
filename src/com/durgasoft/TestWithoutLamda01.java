package com.durgasoft;

 interface InterfBase01{
	public void m1();
}

 class InterfChild01 implements InterfBase01{

	@Override
	public void m1() {
		System.out.println("method one execution"); 		
	}
	
}
public class TestWithoutLamda01 {
public static void main(String[] args) {
	InterfBase01 base01= new InterfChild01();
	base01.m1();
}
}
