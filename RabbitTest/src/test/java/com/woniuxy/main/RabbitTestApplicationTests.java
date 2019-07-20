package com.woniuxy.main;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.config2.Sender;






@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitTestApplicationTests {
	
	@Resource
	private Sender sender;
	
	@Test
	public void contextLoads() {
		sender.send();
	}

}
