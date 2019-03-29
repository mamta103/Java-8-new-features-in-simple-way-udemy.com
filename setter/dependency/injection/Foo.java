package com.setter.dependency.injection;

public class Foo {
	private String name;
	private String telephoneNumber;
	private int age;

	public Foo() {
		super();
	}

	@Override
	public String toString() {
		return "Foo [name=" + name + ", telephoneNumber=" + telephoneNumber + ", age=" + age + "]";
	}

	public Foo(String name, String telephoneNumber, int age) {
		super();
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.age = age;
	}

	public Foo(int age, String name, String telephoneNumber) {
		super();
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.age = age;
	}

}
