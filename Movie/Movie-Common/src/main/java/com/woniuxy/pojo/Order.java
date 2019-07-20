package com.woniuxy.pojo;

import lombok.Data;

@Data
public class Order {
	private int oid;
	private int rid;
	private int uid;
	private int flag;
	private int status;
	private String starttime;
	private String ordernum;
	private int price;
	
}
