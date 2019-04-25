package com.durgasoft;


@FunctionalInterface
interface InterfBase03{
	public void add(int i,int j);
}

class InterfChild03 implements InterfBase03{

	@Override
	public void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Sum "+ (i+j));
	}
	
}
public class TestWithoutLamda02 {
public static void main(String[] args) {
	InterfBase03 interfBase03= new InterfChild03();
	interfBase03.add(12, 12);
}
}
