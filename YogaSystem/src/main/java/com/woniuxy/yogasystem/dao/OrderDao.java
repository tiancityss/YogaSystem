package com.woniuxy.yogasystem.dao;

import org.apache.ibatis.annotations.Insert;

import com.woniuxy.yogasystem.pojo.Order_Form;

public interface OrderDao {
	
	@Insert("insert into order_form(tid,cid,price,classtime,starttime,vid) values(#{tid},#{cid},#{price},#{classTime},#{startTime},#{vid})")
	public boolean addOrder(Order_Form form);
}
