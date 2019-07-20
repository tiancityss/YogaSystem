package com.woniuxy.config2;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@RabbitListener(queues="queue1")
public class Revc {
	
	@RabbitHandler
	public void process(String value){
		System.out.println("信息获取1："+value);
	}
}
