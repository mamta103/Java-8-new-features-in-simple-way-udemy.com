package com.setter.dependency.injection;

import org.springframework.stereotype.Component;

@Component
public class College {
	private Principal principal;

	public College(Principal principal) {
		super();
		this.principal = principal;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.PrincipalInfo();
		System.out.println("CollegeConfig test method:: ");
	}
}
