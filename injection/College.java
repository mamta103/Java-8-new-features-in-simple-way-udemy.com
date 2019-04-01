package com.setter.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("CTS COM")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;
	
	
	/*public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal() :::::::::::::::::::::::::::::");

	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("using setTeacher() >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}*/


	public  void test() {
		System.out.println("CollegeConfig test() method::>>>>>>> ");
		System.out.println("collegeName ::"+collegeName);
	}
	
	
	
}