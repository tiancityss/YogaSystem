package com.woniuxy.yogasystem.pojo;

public class Request_Message {
	private int id;
	private int uid1;
	private int uid2;
	private int pid;
	private int price;
	private String content;
	private String name;
	private String img;
	private int vid;
	private int character;
	private int type;
	@Override
	public String toString() {
		return "Request_Message [id=" + id + ", uid1=" + uid1 + ", uid2=" + uid2 + ", pid=" + pid + ", price=" + price
				+ ", content=" + content + ", name=" + name + ", img=" + img + ", vid=" + vid + ", character="
				+ character + ", type=" + type + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getUid1() {
		return uid1;
	}
	public void setUid1(int uid1) {
		this.uid1 = uid1;
	}
	public int getUid2() {
		return uid2;
	}
	public void setUid2(int uid2) {
		this.uid2 = uid2;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	public int getCharacter() {
		return character;
	}
	public void setCharacter(int character) {
		this.character = character;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
