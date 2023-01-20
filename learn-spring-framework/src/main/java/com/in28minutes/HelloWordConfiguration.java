package com.in28minutes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

@Configuration
public class HelloWordConfiguration {
	
	@Bean
	public String name() {
		return "Levi";
	}
	
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Artur",11);
	}

}
