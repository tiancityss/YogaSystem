package com.woniuxy.yogasystem.pojo;

public class Private_Course {
	private int id;
	private int vid;
	private int cid;
	private int price;
	private String startTime;
	private Venues venues;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Venues getVenues() {
		return venues;
	}
	public void setVenues(Venues venues) {
		this.venues = venues;
	}
	@Override
	public String toString() {
		return "Private_Course [id=" + id + ", vid=" + vid + ", cid=" + cid + ", price=" + price + ", startTime="
				+ startTime + ", venues=" + venues + "]";
	}
	
	
}
