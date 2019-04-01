package com.setter.dependency.injection;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	
	public Principal  principalInfo(){
		System.out.println("Principal Class PrincipalInfo ::>>>>>>>>::)");
		return new Principal();
	}
}
