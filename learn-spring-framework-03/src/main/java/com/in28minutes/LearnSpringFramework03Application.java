package com.in28minutes;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearnSpringFramework03Application {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFramework03Application.class, args);
		
		 var context = new AnnotationConfigApplicationContext();
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
