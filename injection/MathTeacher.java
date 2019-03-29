package com.setter.dependency.injection;

public class MathTeacher  implements Teacher{

	@Override
	public void teach() {

		System.out.println("I am your MathTeacher from MathTeacher service class");
	}

}
