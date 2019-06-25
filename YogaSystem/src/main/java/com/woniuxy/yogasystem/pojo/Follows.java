package com.woniuxy.yogasystem.pojo;

public class Follows {
	private int id;
	private int uid;
	private int followuid;
	private String img;
	private String name;
	private int character;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getFollowuid() {
		return followuid;
	}
	public void setFollowuid(int followuid) {
		this.followuid = followuid;
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
	public int getCharacter() {
		return character;
	}
	public void setCharacter(int character) {
		this.character = character;
	}
	
}
