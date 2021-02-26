package com.college.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.college.app")
public class CollegeConfig {
		
	@Bean
	CollegeController controllerBean() {
		return new CollegeController();
	}
	
}
