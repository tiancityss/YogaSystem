package com.woniuxy.yogasystem.service;

import com.woniuxy.yogasystem.pojo.Address;
import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.User;

public interface UserService {
	//检查账号是否存在
	public String checkacc(String acc);
	//注册账号
	public boolean register(User user); 
	//登录
	public User login(User user);
	//学员补全资料
	public String regTrainee(Trainee trainee,Address address,int role);
	//教练
}
