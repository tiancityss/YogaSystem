package com.woniuxy.yogasystem.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.yogasystem.dao.UserDao;
import com.woniuxy.yogasystem.pojo.Address;
import com.woniuxy.yogasystem.pojo.Trainee;
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
	
	@Override
	public boolean register(User user) {
		boolean re=false;
		if(re =userdao.register(user)){
			User user1=userdao.checkMessageByAcc(user);
			re=userdao.insertdefaultByUid(user1);
		}
		
		return  re;
	}

	@Override
	public User login(User user) {
		User user2=null;
		
		if(userdao.checkacc(user.getAcc())==null){
			return user2;
		}else{
			user2=userdao.checkMessageByAcc(user);
		}
		return user2;
	}

	@Override
	public String regTrainee(Trainee trainee, Address address,int role) {
		String result="失败";
		if(userdao.updateDefault(trainee)>0&&userdao.insertTrainee(trainee)>0&&
				userdao.insertAdd(address)&&userdao.roleupdate(role, trainee.getUid())>0){
			result="成功";
		}
		return result;
	}

}
