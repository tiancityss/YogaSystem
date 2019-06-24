package com.woniuxy.yogasystem.service;

import java.util.List;

import com.woniuxy.yogasystem.pojo.Address;
import com.woniuxy.yogasystem.pojo.Coach;
import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.User;
import com.woniuxy.yogasystem.pojo.Venues;

public interface UserService {
	//检查账号是否存在
	public String checkacc(String acc);
	//注册账号
	public boolean register(User user); 
	//登录
	public User login(User user);
	//学员补全资料
	public String regTrainee(Trainee trainee,Address address,int role);
	//教练补全资料
	public String regCoach(Coach coach,Address address,int role);
	//场馆补全资料
	public String regVenues(Venues venues,Address address,int role,List<String> piclist);
}
