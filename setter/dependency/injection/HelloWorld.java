package com.setter.dependency.injection;

public class HelloWorld {
	/** Dependency on Foo class. */
	private Foo foo;

	/** a constructor so that the Spring container can 'inject' a Foo */
	public HelloWorld(Foo foo) {
		this.foo = foo;

	}

	@Override
	public String toString() {
        return " HelloWorld! foo : \n " + foo;
	}

}
