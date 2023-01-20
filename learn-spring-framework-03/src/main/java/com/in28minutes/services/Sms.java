package com.in28minutes.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
public class Sms implements Message {

	@Override
	public void eviar(String message) {
		// TODO Auto-generated method stub

	}
	
	@PostConstruct
	public void init() {
		System.out.println("Iniciando o objegto Sms.....");
	}

	@PreDestroy
	public void finalyzed() {
		System.out.println("Finalizando o objegto Sms.....");
	}

}
