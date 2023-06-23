package com.test.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person (String name, int age, Address address) {}

record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	

	@Bean
	public String name() {
		return "Aditya";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Vadapav",20,new Address("YOYO","Test"));
	}
	
	
	@Bean (name = "add")
	public Address address(){
		return new Address("Sector 12","Kharghar");
	}
	
	@Bean(name = "personMethodCall")
	public Person person2() {
		return new Person(name(),age(),address());
	}
	
	@Bean (name = "personParameters")
	public Person person3(String name,int age,Address address2) {
		
		return new Person(name,age,address2);
	}
	
}
