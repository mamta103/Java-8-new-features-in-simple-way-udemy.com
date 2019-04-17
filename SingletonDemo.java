package singleton.design.pattern.in.java;

public class SingletonDemo {

	/*
	 * Static member: It gets memory only once because of static, itcontains the
	 * instance of the Singleton class.
	 */

	private static SingletonDemo singletonDemo = new SingletonDemo();

	/*
	 * Private constructor: It will prevent to instantiate the Singleton class
	 * from outside the class.
	 */
	private SingletonDemo() {

	}

	/*
	 * Static factory method: This provides the global point of access to the
	 * Singleton object and returns the instance to the caller.
	 */
	public static SingletonDemo getInstance() {
		return singletonDemo;
	}

	public void doSomething() {
		// write your code
	}
}
