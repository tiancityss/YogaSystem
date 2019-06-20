package com.woniuxy.yogasystem.pojo;

public class User {
	private Integer id;
	private String acc;
	private String pwd;
	private String role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(Integer id, String acc, String pwd, String role) {
		super();
		this.id = id;
		this.acc = acc;
		this.pwd = pwd;
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", acc=" + acc + ", pwd=" + pwd + ", role=" + role + "]";
	}


	
}
