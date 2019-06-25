package com.woniuxy.yogasystem.pojo;

import java.util.List;

public class Trainee {
	private int id;
	private String phone;
	private int status;
	private int uid;
	private String addr;
	private String img;
	private String name;
	private List<Coach> coachs;
	private List<Venues> venues;
	private List<Request_Message> messages;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Coach> getCoachs() {
		return coachs;
	}
	public void setCoachs(List<Coach> coachs) {
		this.coachs = coachs;
	}
	public List<Venues> getVenues() {
		return venues;
	}
	public void setVenues(List<Venues> venues) {
		this.venues = venues;
	}
	public List<Request_Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Request_Message> messages) {
		this.messages = messages;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
}
