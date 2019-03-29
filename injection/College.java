package com.setter.dependency.injection;

import org.springframework.stereotype.Component;

@Component
public class College {
	private Principal principal;

	//Constructor Dependency Injection Approach
	/*public College(Principal principal) {
		super();
		this.principal = principal;
	}*/

		public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.PrincipalInfo();
		System.out.println("CollegeConfig test method:: ");
	}
}
