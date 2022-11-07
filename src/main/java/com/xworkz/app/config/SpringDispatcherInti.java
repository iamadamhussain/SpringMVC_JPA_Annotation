package com.xworkz.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//@Configuration
public class SpringDispatcherInti extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{
	
	public SpringDispatcherInti() {
		System.out.println("---------SpringDispatcherInti constr------");
			}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("----getRootConfigClasses-------");
		// TODO Auto-generated method stub
		 return new Class[] {MvcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("----getServletConfigClasses-------");

		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("---------getServletMappings---------------");
		return new String[] {"/"};// ---> / indicates any url pattern
	}

}
