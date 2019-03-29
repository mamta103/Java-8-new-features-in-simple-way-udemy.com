package com.setter.dependency.injection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.setter.dependency.injection")
public class CollegeConfig {
	public static void test() {
		System.out.println("CollegeConfig test method:: ");
	}
}
