package com.woniuxy.yogasystem.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.User;

public interface UserDao {
//查询用户账户是否存在
@Select("select * from user where acc=#{acc}")
public User checkacc(String acc);
//注册信息
@Insert("insert into user(acc,pwd,role,flag) values (#{acc},#{pwd},0,0)")
public boolean register(User user); 
@Insert("insert into trainee(uid,phone,status,name) values(#{uid},#{phone},0,#{phone})")
public boolean insertdefaultByUid(int uid, Trainee trainee);
//通过账户查密码
@Select("select pwd from user where acc=#{acc}")
public String findPwdByAcc(User user);
//查询所有用户的信息
@Select("select * from user where acc=#{acc}")
public User checkMessageByAcc(User user); 
}
