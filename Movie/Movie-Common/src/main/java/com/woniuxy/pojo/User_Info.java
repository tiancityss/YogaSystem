package com.woniuxy.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class User_Info {
	private int id;
	private int uid;
	private String name;
	private String tel;
	private Date bir;
	private int points;
	private int vip;
	private int flag;
	
}
