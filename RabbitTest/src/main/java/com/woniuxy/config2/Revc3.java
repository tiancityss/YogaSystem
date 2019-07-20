package com.woniuxy.config2;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@RabbitListener(queues="queue3")
public class Revc3 {
	
	@RabbitHandler
	public void process(String value){
		System.out.println("信息获取3："+value);
	}
}
