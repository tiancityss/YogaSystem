package com.woniuxy.yogasystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.woniuxy.yogasystem.pojo.Address;
import com.woniuxy.yogasystem.pojo.Coach;
import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.User;
import com.woniuxy.yogasystem.pojo.Venues;

public interface UserDao {
	/*
	 * 公共操作
	 */
//查询用户账户是否存在
@Select("select * from user where acc=#{acc}")
public User checkacc(String acc);
//注册信息
@Insert("insert into user(acc,pwd,role,flag) values (#{acc},#{pwd},0,0)")
public boolean register(User user); 
//通过账户查密码
@Select("select pwd from user where acc=#{acc}")
public String findPwdByAcc(User user);
//查询所有用户的信息
@Select("select * from user where acc=#{arg0}")
public User checkMessageByAcc(String acc); 
//插入地址
@Insert("insert into address (province,city,county,town,detail,uid)values(#{province},#{city},#{county},#{town},#{detail},#{uid})")
public boolean insertAdd(Address address);
//分配角色
@Update("update user set role =#{arg0} where id=#{arg1}")
public int roleupdate(int role,int uid);

/*
 * 对学员的一系列操作
 */

//填写资料时给学员一个默认的手机号  uid 状态 名字 
@Insert("insert into trainee(uid,phone,status,name,flag,sex,img) values(#{id},#{acc},0,#{acc},0,1,'/headimg/yuga.jpg')")
public boolean insertdefaultByUid(User user);
//更新 用户现在已有的信息
@Update("update trainee set sex=#{sex},img=#{img}, phone=#{phone},status=#{status},name=#{name} where uid=#{uid}")
public int updateDefault(Trainee trainee);



/*
 * 队教练补充资料的一系列操作
 */

//填写资料时给教练一个默认的手机号  uid 状态 名字 性别 头像 认证 是否任课 薪资
@Insert("insert into coach(uid,phone,infostatus,name,flag,sex,img,authentication,privatetime,salary,school,authstatus) values(#{id},#{acc},0,#{acc},0,1,'/headimg/yuga.jpg',0,0,0,' ','  ')")
public boolean insertCoachdefaultByUid(User user);
//更新 教练现在已有的信息
@Update("update coach set sex=#{sex},img=#{img}, phone=#{phone},infostatus=#{infostatus},name=#{name},privatetime=#{privatetime},salary=#{salary},school=#{school},authstatus=#{authstatus} where uid=#{uid}")
public int updateCoachDefault(Coach coach);


/*
 * 对场馆的一系列操作
 * 
 */
//填写资料时给场馆一个默认的手机号  uid 名字 性 头像 认证  薪资 描述
@Insert("insert into venues (uid,img,name,phone,descrie,flag,salary) values (#{id},'/headimg/yuga.jpg',#{acc},#{acc},' ',0,0)")
public boolean insertVenuesdefaultByUid(User user);
//更新场馆已有的信息
@Update("update venues set img=#{img},name=#{name},phone=#{phone},descrie=#{descrie},salary=#{salary}")
public int updateVenuesDefault(Venues venues);
//插入场馆图片
@Insert("insert into venues_img (venuesid,img,flag) values(#{arg1},#{arg0},0)")
public boolean insertVenusePic(String pic,int venuesid);
 }
