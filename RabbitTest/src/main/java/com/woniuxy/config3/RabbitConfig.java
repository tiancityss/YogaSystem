package com.woniuxy.config3;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
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
	public TopicExchange topicExchange(){
		return new TopicExchange("topicExchange");
	}
	
	@Bean
	public Binding bingdingExchangeA(Queue AMessage,TopicExchange topicExchange){
		return BindingBuilder.bind(AMessage).to(topicExchange).with("queue1");
	}
	@Bean
	public Binding bingdingExchangeB(Queue BMessage,TopicExchange topicExchange){
		return BindingBuilder.bind(BMessage).to(topicExchange).with("queue2");
	}
	@Bean
	public Binding bingdingExchangeC(Queue CMessage,TopicExchange topicExchange){
		return BindingBuilder.bind(CMessage).to(topicExchange).with("#");
	}
}
