package com.setter.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired
	private Principal principal;
	@Autowired
	private Teacher teacher;

	
	public void test() {
		principal.PrincipalInfo();
		System.out.println("CollegeConfig test method:: ");
		teacher.teach();
	}
}
