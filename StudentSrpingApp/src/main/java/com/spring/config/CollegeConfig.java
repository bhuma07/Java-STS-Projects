package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CollegeConfig  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("check");
		return new 	Class[] {CollegeWebConfig.class,CollegeDatabaseConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("servelt check");
		return new String[] { "/" };
	}

}
