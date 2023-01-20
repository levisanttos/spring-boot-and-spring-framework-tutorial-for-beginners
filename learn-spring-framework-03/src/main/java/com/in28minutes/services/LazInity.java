package com.in28minutes.services;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class LazInity {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(LazInity.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		context.getBean(MessageService.class).enviar("Email para o Levi");
	}

}
