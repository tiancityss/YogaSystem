package com.woniuxy.yogasystem.pojo;

public class Private_Course {
	private int id;
	private int vid;
	private int cid;  
	private int price;
	private String starttime;
	private Venues venues;
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public Venues getVenues() {
		return venues;
	}
	public void setVenues(Venues venues) {
		this.venues = venues;
	}
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
	@Override
	public String toString() {
		return "Private_Course [id=" + id + ", vid=" + vid + ", cid=" + cid + ", price=" + price + ", starttime="
				+ starttime + ", venues=" + venues + "]";
	} 
}
