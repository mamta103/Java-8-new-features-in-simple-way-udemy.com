package com.setter.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("context :::");
		College college=context.getBean("collegeBean",College.class);
		System.out.println("get bean :::"+college);
	}

}
