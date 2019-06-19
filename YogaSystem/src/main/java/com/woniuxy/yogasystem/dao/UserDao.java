package com.woniuxy.yogasystem.dao;

import org.apache.ibatis.annotations.Select;

import com.woniuxy.yogasystem.pojo.User;

public interface UserDao {
@Select("select * from user where acc=#{acc}")
public User checkacc(String acc);
}
