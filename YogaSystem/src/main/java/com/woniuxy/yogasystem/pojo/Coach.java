package com.woniuxy.yogasystem.pojo;

public class Coach {
private int uid;
private String phone;
private String infostatus;
private String school;
private int sex;
//认课类型
private String authstatus;
//是否认证
private String authentication;
private String name;
private String img;
private int flag;
private int salary;
private int privatetime;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getInfostatus() {
	return infostatus;
}
public void setInfostatus(String infostatus) {
	this.infostatus = infostatus;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getAuthstatus() {
	return authstatus;
}
public void setAuthstatus(String authstatus) {
	this.authstatus = authstatus;
}
public String getAuthentication() {
	return authentication;
}
public void setAuthentication(String authentication) {
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
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}

public int getPrivatetime() {
	return privatetime;
}
public void setPrivatetime(int privatetime) {
	this.privatetime = privatetime;
}
public Coach(int uid, String phone, String infostatus, String school, int sex, String authstatus, String authentication,
		String name, String img, int flag, int salary, int privatetime) {
	super();
	this.uid = uid;
	this.phone = phone;
	this.infostatus = infostatus;
	this.school = school;
	this.sex = sex;
	this.authstatus = authstatus;
	this.authentication = authentication;
	this.name = name;
	this.img = img;
	this.flag = flag;
	this.salary = salary;
	this.privatetime = privatetime;
}
public Coach() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Coach [uid=" + uid + ", phone=" + phone + ", infostatus=" + infostatus + ", school=" + school + ", sex="
			+ sex + ", authstatus=" + authstatus + ", authentication=" + authentication + ", name=" + name + ", img="
			+ img + ", flag=" + flag + ", salary=" + salary + ", privatetime=" + privatetime + "]";
}



}
