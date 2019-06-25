package com.woniuxy.yogasystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.woniuxy.yogasystem.pojo.Coach;
import com.woniuxy.yogasystem.pojo.Request_Message;
import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.Venues;
import com.woniuxy.yogasystem.provider.VenuesProvider;

public interface VenuesDao {
	//搜索学员功能
	@SelectProvider(type=VenuesProvider.class,method="findTraineeMsg")
	public List<Trainee> findManyTraineeMsg(Trainee trainee);
	
	//搜索教练功能
	@SelectProvider(type=VenuesProvider.class,method="findCoachMsg")
	public List<Coach> findManyCoachMsg(Coach coach);
	
	//查看我签约的学员
	@Select("select * from venues inner join trainee_venues on venues.id=trainee_venues.vid"
			+ "where venues.id=#{uid}")
	public List<Trainee> findSignTraineeMsg(int uid);
	
	//查看我签约的教练
	@Select("select * from venues inner join coach_venues on venues.id=coach_venues.vid"
			+ "where venues.id=#{uid}")
	public List<Coach> findSignCoachMsg(int uid);
	
	//签约教练：发送申请消息给教练 
	@Insert("insert into request_message(uid1,uid2,content,name,price,character,type)"
			+ "values(#{uid1},#{uid2},#{content},#{name},"
			+ "#{price},#{character},#{type})")		
	public void insertCoachMsg(Request_Message re);	
	
	//展示通知消息
	@Select("select content from request_message where uid2=#{uid} and type=0 and flag=0")
	public List<Request_Message> findMsgContent(int uid);
		
	//插入场馆接受教练通知消息
	@Insert("insert into request_message(uid1,uid2,content,name,character,type)"
			+ "values(#{uid1},#{uid2},#{content},#{name}," + "#{character},#{type})")
	public void insertReplyMsg(Request_Message re);
	
	//处理申请消息
	@Update("update request_message set flag=1 where id=#{id}")
	public void handleAllMsg(int id);
	
	//查询场馆具体信息
	@Select("select * from venues where uid=#{vid}")
	public Venues findVenuesMsg(int vid);
	
}
