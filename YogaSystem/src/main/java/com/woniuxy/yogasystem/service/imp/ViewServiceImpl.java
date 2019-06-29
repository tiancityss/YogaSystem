package com.woniuxy.yogasystem.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.yogasystem.dao.ViewDao;
import com.woniuxy.yogasystem.pojo.View;
import com.woniuxy.yogasystem.service.ViewService;
@Service("ViewService")
public class ViewServiceImpl implements ViewService{
	@Autowired
	private ViewDao viewDao;
	@Override
	public void insertView(View view) {
		// TODO Auto-generated method stub
		viewDao.insertView(view);
	}

}
