package com.woniuxy.config1;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Sender2 {
	@Resource
	private AmqpTemplate amqpTemplate;
	
	public void send(){
		String mes = "hello";
		amqpTemplate.convertAndSend("queue2",mes);
		
	}


}
