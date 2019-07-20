package com.woniuxy.config2;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	@Resource
	private AmqpTemplate amqpTemplate;
	
	public void send(){
		String mes = "hello";
		amqpTemplate.convertAndSend("fanoutExchange","",mes);
		
	}


}
