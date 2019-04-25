package com.durgasoft;

class WithoutRunOverridingChild extends Thread{
	
}
public class WithoutRunOverridingParent {

	public static void main(String[] args) {
		WithoutRunOverridingChild wrc= new WithoutRunOverridingChild();
		wrc.start();
	}

}
