package com.woniuxy.yogasystem.pojo;

public class User {
	private Integer id;
	private String acc;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public User(Integer id, String acc, String pwd) {
		super();
		this.id = id;
		this.acc = acc;
		this.pwd = pwd;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", acc=" + acc + ", pwd=" + pwd + "]";
	}

	
}
