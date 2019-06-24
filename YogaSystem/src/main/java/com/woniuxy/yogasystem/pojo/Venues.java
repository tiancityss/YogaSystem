package com.woniuxy.yogasystem.pojo;

public class Venues {
private  int uid;
private String img;
private String name;
private String phone;
private int flag;
private String detail;
private String descrie;
private int salary;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getDescrie() {
	return descrie;
}
public void setDescrie(String descrie) {
	this.descrie = descrie;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Venues(int uid, String img, String name, String phone, int flag, String detail, String descrie, int salary) {
	super();
	this.uid = uid;
	this.img = img;
	this.name = name;
	this.phone = phone;
	this.flag = flag;
	this.detail = detail;
	this.descrie = descrie;
	this.salary = salary;
}
public Venues() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Venues [uid=" + uid + ", img=" + img + ", name=" + name + ", phone=" + phone + ", flag=" + flag
			+ ", detail=" + detail + ", descrie=" + descrie + ", salary=" + salary + "]";
}



}
