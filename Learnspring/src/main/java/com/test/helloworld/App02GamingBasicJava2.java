package com.test.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava2 {

	public static void main(String[] args) {
	
		//Launch a spring context
		
		try( var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
		 
		 //Configure things that we want to manage - @Configuration
		 
		 
		 System.out.println(context.getBean("name"));
		 
		 System.out.println(context.getBean("age"));
		
		 
		 System.out.println(context.getBean("person"));
		 
		 System.out.println(context.getBean("add"));
		 
		 System.out.println(context.getBean("personMethodCall"));

		 System.out.println(context.getBean("personParameters"));
		 
		}
	}

}
