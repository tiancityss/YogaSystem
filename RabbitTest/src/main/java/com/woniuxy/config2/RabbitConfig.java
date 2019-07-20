package com.woniuxy.config2;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	private final static String Queue_Name="queue1";
	private final static String Queue_Name1="queue2";
	private final static String Queue_Name2="queue3";
	
	@Bean
	public Queue AMessage(){
		return new Queue(Queue_Name);
	}
	
	@Bean
	public Queue BMessage(){
		return new Queue(Queue_Name1);
	}
	
	@Bean
	public Queue CMessage(){
		return new Queue(Queue_Name2);
	}
	
	@Bean
	public FanoutExchange fanoutExchange(){
		return new FanoutExchange("fanoutExchange");
	}
	
	@Bean
	public Binding bingdingExchangeA(Queue AMessage,FanoutExchange fanoutExchange){
		return BindingBuilder.bind(AMessage).to(fanoutExchange);
	}
	@Bean
	public Binding bingdingExchangeB(Queue BMessage,FanoutExchange fanoutExchange){
		return BindingBuilder.bind(BMessage).to(fanoutExchange);
	}
	@Bean
	public Binding bingdingExchangeC(Queue CMessage,FanoutExchange fanoutExchange){
		return BindingBuilder.bind(CMessage).to(fanoutExchange);
	}
}
