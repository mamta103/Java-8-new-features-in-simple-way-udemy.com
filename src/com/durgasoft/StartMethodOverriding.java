package com.durgasoft;

//if override start() method then behave will be normal as like a overriding
class StartMethodChild extends Thread {
	public void start() {
		System.out.println("@@ StartMethodChild start() method");
	}

	public void run() {
		System.out.println(">> StartMethodChild run() method");

	}
}

public class StartMethodOverriding {
	public static void main(String[] args) {
		StartMethodChild smc = new StartMethodChild();
		smc.start();
	}
}
