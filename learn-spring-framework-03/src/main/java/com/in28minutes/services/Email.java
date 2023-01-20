package com.in28minutes.services;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Email implements Message {
	
	@PostConstruct
	public void init() {
		System.out.println("Iniciando o objegto Email.....");
	}

	@Override
	public void eviar(String message) {
		// TODO Auto-generated method stub

	}
	
	@PreDestroy
	public void finalyzed() {
		System.out.println("Finalizando o objegto Email.....");
	}

}
