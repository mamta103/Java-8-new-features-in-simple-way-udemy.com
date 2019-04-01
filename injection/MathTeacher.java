package com.setter.dependency.injection;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("MathTeacher teach() Method calling:: ::");
		return  ;
	}

}
