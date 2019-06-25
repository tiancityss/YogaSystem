package com.woniuxy.yogasystem.pojo;

import java.util.List;

public class Venues {
	private int id;
	private int uid;
	private String name;
	private String addr;
	private String phone;
	private String detail;
	private String img;
	private int price;//入会价格
	private List<Coach> coach;
	private List<Trainee> trainees;
	private List<Request_Message> messages;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Trainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}
	public List<Request_Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Request_Message> messages) {
		this.messages = messages;
	}
	public List<Coach> getCoach() {
		return coach;
	}
	public void setCoach(List<Coach> coach) {
		this.coach = coach;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Venues [id=" + id + ", uid=" + uid + ", name=" + name + ", addr=" + addr + ", phone=" + phone
				+ ", detail=" + detail + ", img=" + img + ", price=" + price + ", coach=" + coach + ", trainees="
				+ trainees + ", messages=" + messages + "]";
	}
	
	
}
