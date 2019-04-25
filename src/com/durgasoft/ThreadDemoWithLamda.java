package com.durgasoft;

public class ThreadDemoWithLamda {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i <= 10; i++)
				System.out.println("Value of i::" + i);

		};
		Thread thread= new Thread(runnable);
		thread.start();
		for (int i = 0; i <= 10; i++)
			System.out.println("Main Thread:: ");

	}

}
