package com.xworkz.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.app")
public class MvcConfig {
	public MvcConfig() {
System.out.println("------MvcConfig----------");
}

	
	@Bean
	public ViewResolver createVieWResolver() {
	System.out.println("--createVieWResolver------------------");	
		return new InternalResourceViewResolver("/", ".jsp");
		
	}
	
	

}
