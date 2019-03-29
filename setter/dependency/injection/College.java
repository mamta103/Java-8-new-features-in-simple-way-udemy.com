package com.setter.dependency.injection;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	public static void test() {
		System.out.println("CollegeConfig test method:: ");
	}
}
