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
	//注册管理员
	public boolean regManager(User user);
	//登录
	public User login(User user);
	//找回密码
	public int reset(User user);
	//学员补全资料
	public String regTrainee(Trainee trainee,Address address,int role);
	//教练补全资料
	public String regCoach(Coach coach,Address address,int role);
	//场馆补全资料
	public String regVenues(Venues venues,Address address,int role,List<String> piclist);
	//查询场馆全部信息
	public Venues findVenues(int uid);
	//查询教练全部信息
	public Coach findCoach(int uid);
	//查询学员全部信息
	public Trainee findTrainee(int uid);
	//查询学员地址
	public Address findTraineeAdd(int uid);
	//查询教练地址
	public Address findCochAdd(int uid);
	//查询场馆地址
	public Address findVenuesAdd(int uid);
	//修改资料更新学员信息
	public String updateTraineeMes(Trainee trainee,Address address);
	//修改资料更新教练信息
	public String updateCoachMes(Coach coach,Address address);
	//修改资料更新场馆信息
		public String updateVenuesMes(Venues venues,Address address,List<String> piclist);
}
