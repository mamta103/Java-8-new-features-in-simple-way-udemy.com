package com.setter.dependency.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean(name={"CollegeBean","CB"})
	public College getCollegeBean(){
		return new College();
	}
}
