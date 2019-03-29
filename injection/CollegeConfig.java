package com.setter.dependency.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

	@Bean
	public College getCollegeBean() {
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(getMathTeacherBean());
		return college;

	}

	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean
	public MathTeacher getMathTeacherBean() {
		return new MathTeacher();

	}
}
