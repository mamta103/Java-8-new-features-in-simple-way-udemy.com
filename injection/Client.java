package com.setter.dependency.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
	College college= context.getBean("cb",College.class);
	college.test();
	
}
}
