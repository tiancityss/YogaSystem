package com.woniuxy.yogasystem.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.woniuxy.yogasystem.pojo.Address;
import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.User;

public interface UserDao {
//查询用户账户是否存在
@Select("select * from user where acc=#{acc}")
public User checkacc(String acc);
//注册信息
@Insert("insert into user(acc,pwd,role,flag) values (#{acc},#{pwd},0,0)")
public boolean register(User user); 
//注册时给一个默认的手机号  uid 状态 名字 
@Insert("insert into trainee(uid,phone,status,name,flag,sex,img) values(#{id},#{acc},0,#{acc},0,1,'/headimg/yuga.jpg')")
public boolean insertdefaultByUid(User user);
//通过账户查密码
@Select("select pwd from user where acc=#{acc}")
public String findPwdByAcc(User user);
//查询所有用户的信息
@Select("select * from user where acc=#{acc}")
public User checkMessageByAcc(User user); 
//更新 用户现在已有的信息
@Update("update trainee set phone=#{phone},status=#{status},name=#{name} where uid=#{uid}")
public int updateDefault(Trainee trainee);
//插入用户性别 头像
@Update("update trainee set sex=#{sex},img=#{img} where uid=#{uid}")
public int insertTrainee(Trainee trainee);
//插入地址
@Insert("insert into address (province,city,county,town,detail,uid)values(#{province},#{city},#{county},#{town},#{detail},#{uid})")
public boolean insertAdd(Address address);
//分配角色
@Update("update user set role =#{arg0} where id=#{arg1}")
public int roleupdate(int role,int uid);

 }
