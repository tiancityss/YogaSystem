package com.woniuxy.yogasystem.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.yogasystem.dao.UserDao;
import com.woniuxy.yogasystem.pojo.User;
import com.woniuxy.yogasystem.service.UserService;
@Service("userService")
public class UserServiceImp implements UserService{
	@Resource
private UserDao userdao;
	@Override
	public String checkacc(String acc) {
		String result="手机号已被注册不可用";
		User user=userdao.checkacc(acc);
		if(user==null){
			result="手机号可用";
		}
		return result;
	}

}
