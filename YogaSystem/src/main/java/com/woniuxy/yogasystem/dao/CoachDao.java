package com.woniuxy.yogasystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.woniuxy.yogasystem.pojo.Coach;
import com.woniuxy.yogasystem.pojo.Request_Message;
import com.woniuxy.yogasystem.pojo.Trainee;

public interface CoachDao {
	
	@Select("select * from coach where uid=#{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="phone",property="phone"),
		@Result(column="infostatus",property="infostatus"),
		@Result(column="addr",property="addr"),
		@Result(column="school",property="school"),
		@Result(column="authentication",property="authentication"),
		@Result(column="name",property="name"),
		@Result(column="img",property="img"),
		@Result(column="privatetime",property="privatetime"),
		@Result(column="uid",property="uid")
		//@Result(column="id",property="trainees",many=@Many(select="com.woniuxy.yogasystem.dao.TraineeDao.findTraineeByCid")),
		//@Result(column="id",property="venues",many=@Many(select="com.woniuxy.yogasystem.dao.VenuesDao.findVenuesByCid")),
		//@Result(column="id",property="messages",many=@Many(select="com.woniuxy.yogasystem.dao.MessageDao.findMessageByCid"))
	})
	public Coach findCoachById(int id);
	
	
	
	@Select("select * from coach where id=#{cid}")
	public Coach findCoachByCid(int cid);
	
	

	
	
}
