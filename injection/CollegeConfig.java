package com.setter.dependency.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean(name="cb")
	public College College(){
		return new College(principalBean());
	}
	
	@Bean(name="principalBean")
	public Principal principalBean(){
		return new Principal();
	}
}
