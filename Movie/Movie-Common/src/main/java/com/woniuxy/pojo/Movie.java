package com.woniuxy.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Movie {
	private int mid;
	private String name;
	private String type;
	private String zone;
	private Date showTime;
	private int attention;
	private String introduce;
	private String prevue;
	private Double price;
	private Double cutprice;
	private int show;
	private int num;
	private int flag;
}
