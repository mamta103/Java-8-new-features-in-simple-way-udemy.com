package com.setter.dependency.injection;

import org.springframework.stereotype.Component;

@Component
public class College {
	private Principal principal;
	private Teacher teacher;

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.PrincipalInfo();
		System.out.println("CollegeConfig test method:: ");
		teacher.teach();
	}
}
