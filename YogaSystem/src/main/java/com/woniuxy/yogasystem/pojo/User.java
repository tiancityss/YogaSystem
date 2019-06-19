package com.woniuxy.yogasystem.pojo;

import java.util.List;

public class User {
	private int id;
	private String acc;
	private String pwd;
	private String role;
	private List<String> authoritys;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public List<String> getAuthoritys() {
		return authoritys;
	}
	public void setAuthoritys(List<String> authoritys) {
		this.authoritys = authoritys;
	}
	
}
