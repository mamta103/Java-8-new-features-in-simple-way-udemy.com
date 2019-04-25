package com.durgasoft;

class MyTask{
	void executeTask(){
		for (int doc = 1; doc <= 10; doc++)
			System.out.println("@@ Printing Document # " + doc+"from Printer2");
	}
}
public class App {

	// main method present main thread
	public static void main(String[] args) {
		// Whenever we write anything here executes by main thread
		// Thread execute alys the job in a sequence

		// Job 1
		System.out.println("==Application Started==");
 
		// Job 2
		MyTask myTask= new MyTask();
		myTask.executeTask();
		
		//Till job2 is not finished , below written jobs are waiting and are not executted because of escuencial opertaion here
		
		// Job 3
		for (int doc = 1; doc <= 10; doc++)
			System.out.println(">> Printing Document # " + doc+"from Printer1");

		// Job 4
		System.out.println("==Application Finished==");

	}

}
