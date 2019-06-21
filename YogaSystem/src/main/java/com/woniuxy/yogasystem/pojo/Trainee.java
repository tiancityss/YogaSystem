package com.woniuxy.yogasystem.pojo;

public class Trainee {
private int id;
private int uid;
private int sex;
private String phone;
//信息是否显示
private int status;
private String add;
private String img;
private String name;
private int flag;
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
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
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
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
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
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public Trainee(int id, int uid, int sex, String phone, int status, String add, String img, String name, int flag) {
	super();
	this.id = id;
	this.uid = uid;
	this.sex = sex;
	this.phone = phone;
	this.status = status;
	this.add = add;
	this.img = img;
	this.name = name;
	this.flag = flag;
}
public Trainee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Trainee [id=" + id + ", uid=" + uid + ", sex=" + sex + ", phone=" + phone + ", status=" + status + ", add="
			+ add + ", img=" + img + ", name=" + name + ", flag=" + flag + "]";
}


}
