package com.woniuxy.config1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	private final static String Queue_Name="queue2";
	
	@Bean
	public Queue string(){
		return new Queue(Queue_Name);
	}
}
