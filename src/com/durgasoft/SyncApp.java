package com.durgasoft;

class Printer{
	 //synchronized void printDocument(int numOfCopies, String docName){
	void printDocument(int numOfCopies, String docName){
	for(int i=1;i<=numOfCopies;i++)
			{try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing Document  "+docName+" "+i);
			}
		
	}
}

class MyThread extends Thread{
	Printer pRef;
	
	public MyThread(Printer printer) {
		pRef= printer;
	}
	@Override
	public void run(){
		synchronized (pRef) {
			pRef.printDocument(10, "MyThread JohnsProfile.pdf");
		}
		
	}
}
class YourThread extends Thread{
	Printer pRef;
	
	public YourThread(Printer printer) {
		pRef= printer;
	}
	@Override
	public void run(){
		pRef.printDocument(10, " YourThread FionnaProfile.pdf");
	}
}


public class SyncApp {
	// main is representing main thread
	public static void main(String[] args) {
		System.out.println("==Application Started==");
 
		//Only one single object of printer
		Printer p= new Printer();
		
		//Scenario is that we have mutliple thread working on thread workinh on same printer Object
		//If Multiple Thread are going to work on the same single object we must Synchronized then
		MyThread myRef= new MyThread(p);//MyThread having reference to the Printer Object
		YourThread yourRef= new YourThread(p);//YourThread having reference to the Printer Object
		myRef.start();
		/*try {
			myRef.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		yourRef.start();
		
		System.out.println("==Application Finished==");

	}

}
