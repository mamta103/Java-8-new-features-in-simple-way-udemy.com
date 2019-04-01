package com.setter.dependency.injection;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.setter.dependency.injection")
public class CollegeConfig {
	
	/*@Bean(name="college")
	public College  getBean(){
		College college=new College();
		college.setPrincipal(getPrincipalBean());
		college.setTeacher(getMathTeacher());
		return college;
	}
	
	@Bean
	public Principal getPrincipalBean(){
		return new Principal();
	}
	
	@Bean
	public Teacher getMathTeacher(){
	 return new MathTeacher();
	}*/
}