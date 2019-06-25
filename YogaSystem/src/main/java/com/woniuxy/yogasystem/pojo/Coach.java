package com.woniuxy.yogasystem.pojo;

import java.util.List;

public class Coach {
	private int id;
	private int uid;
	private String phone;
	private int infostatus;
	private String addr;
	private String school;
	private int authentication;
	private String name;
	private String img;
	private int privatetime;
	private List<Trainee> trainees;
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
	public int getInfostatus() {
		return infostatus;
	}
	public void setInfostatus(int infostatus) {
		this.infostatus = infostatus;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getAuthentication() {
		return authentication;
	}
	public void setAuthentication(int authentication) {
		this.authentication = authentication;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getPrivatetime() {
		return privatetime;
	}
	public void setPrivatetime(int privatetime) {
		this.privatetime = privatetime;
	}
	public List<Trainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
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
