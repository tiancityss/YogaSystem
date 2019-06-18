package com.woniuxy.yogasystem.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.woniuxy.yogasystem.controller")
@ComponentScan("com.woniuxy.yogasystem.service.imp")
@MapperScan("com.woniuxy.yogasystem.dao")
@ComponentScan("com.woniuxy.yogasystem.config")
public class YogaSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(YogaSystemApplication.class, args);
	}

}
