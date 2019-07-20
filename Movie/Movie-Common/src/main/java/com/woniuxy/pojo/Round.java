package com.woniuxy.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Round {
	
	private int rid;
	private int vid;
	private int mid;
	private Date starttime;
	private Date entime;
	private String movietime;
	private int flag;
}
