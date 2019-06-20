package com.woniuxy.yogasystem.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.woniuxy.yogasystem.pojo.User;

public interface UserDao {
@Select("select * from user where acc=#{acc}")
public User checkacc(String acc);
@Insert("insert into user(acc,pwd,role,flag) values (#{acc},#{pwd},0,0)")
public boolean register(User user); 
@Select("select pwd from user where acc=#{acc}")
public String findPwdByAcc(User user);
@Select("select * from user where acc=#{acc}")
public User checkMessageByAcc(User user); 
}
