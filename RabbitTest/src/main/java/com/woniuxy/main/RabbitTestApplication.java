package com.woniuxy.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.woniuxy.config2")
public class RabbitTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitTestApplication.class, args);
	}

}
