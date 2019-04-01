package com.setter.dependency.injection;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
	College college= context.getBean("college",College.class);
	college.test();
	System.out.println("Done !");

	((AbstractApplicationContext) context).close();
}
}