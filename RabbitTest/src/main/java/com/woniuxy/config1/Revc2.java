package com.woniuxy.config1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@RabbitListener(queues="queue2")
public class Revc2 {
	
	@RabbitHandler
	public void process(String value){
		System.out.println("信息获取2："+value);
	}
}
