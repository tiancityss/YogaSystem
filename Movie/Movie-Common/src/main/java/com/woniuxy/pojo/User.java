package com.woniuxy.pojo;

import lombok.Data;

@Data
public class User {
	private int uid;
	private String account;
	private String pass;
	private int role;
	private int flag;
}
