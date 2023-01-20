package com.in28minutes.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MessageService {

	
	private Message message;
	
	public MessageService(Message message) {
		System.out.println("Criando MessageService....");
		this.message = message;
	}
	
	public void enviar(String message) {
		
		System.out.println("Enviando a mensagem: " + message);
		this.message.eviar(message);
	}
}
