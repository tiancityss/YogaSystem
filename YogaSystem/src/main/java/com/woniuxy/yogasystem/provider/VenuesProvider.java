package com.woniuxy.yogasystem.provider;

import org.apache.ibatis.jdbc.SQL;

import com.woniuxy.yogasystem.pojo.Coach;
import com.woniuxy.yogasystem.pojo.Trainee;
                    
public class VenuesProvider {
	//查询
	//select * from coach where
	//authentication=#{authentication}认证 and name=#{name} 姓名
	//and school=#{school}//流派
	public String findCoachMsg(Coach coach){
		SQL sql = new SQL().SELECT("*").FROM("coach");
		if(coach.getName()!=null&& coach.getName().length()!=0){
			sql.WHERE("name like '%"+coach.getName()+"%'");
		}
		if(coach.getSchool()!=null&& coach.getSchool().length()!=0){
			sql.WHERE("school like '%"+coach.getSchool()+"%'");
		}
		if(coach.getAuthentication()>0){
			sql.WHERE("authentication="+coach.getAuthentication());
		}
		return sql.toString();
	}	
	public String findTraineeMsg(Trainee trainee){
		SQL sql = new SQL().SELECT("*").FROM("trainee");
		if(trainee.getName()!=null&& trainee.getName().length()!=0){
			sql.WHERE("name like '%"+trainee.getName()+"%'");
		}
		if(trainee.getAddr()!=null&& trainee.getAddr().length()!=0){
			sql.WHERE("addr like '%"+trainee.getAddr()+"%'");
		}
		return sql.toString();
	}
}
