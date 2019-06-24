package com.woniuxy.yogasystem.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.yogasystem.dao.UserDao;
import com.woniuxy.yogasystem.pojo.Address;
import com.woniuxy.yogasystem.pojo.Coach;
import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.User;
import com.woniuxy.yogasystem.pojo.Venues;
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
	//注册
	@Override
	public boolean register(User user) {
		boolean re=false;
		re =userdao.register(user);
			//User user1=userdao.checkMessageByAcc(user.getAcc());
			//re=userdao.insertdefaultByUid(user1);
		
		
		return  re;
	}

	@Override
	public User login(User user) {
		User user2=null;
		
		if(userdao.checkacc(user.getAcc())==null){
			return user2;
		}else{
			user2=userdao.checkMessageByAcc(user.getAcc());
		}
		return user2;
	}
//补充学员资料
	@Override
	public String regTrainee(Trainee trainee, Address address,int role) {
		boolean re=false;
		String result="失败";
		User user = userdao.checkMessageByAcc(trainee.getPhone());
		re=userdao.insertdefaultByUid(user);
		if(re){
			if(userdao.updateDefault(trainee)>0&&
					userdao.insertAdd(address)&&userdao.roleupdate(role, trainee.getUid())>0){
				result="成功";
			}
		}
		
		return result;
	}
	
	//教练补全资料
	@Override
	public String regCoach(Coach coach, Address address, int role) {
		boolean re=false;
		String result="失败";
		User user = userdao.checkMessageByAcc(coach.getPhone());
		re=userdao.insertCoachdefaultByUid(user);
		if(re){
			if(userdao.updateCoachDefault(coach)>0&&
					userdao.insertAdd(address)&&userdao.roleupdate(role, coach.getUid())>0){
				result="成功";
			}
		}
	
		return result;
	}
	
	//场馆补全资料
	@Override
	public String regVenues(Venues venues, Address address, int role, List<String> piclist) {
		boolean re=false;
		String result="失败";
		User user = userdao.checkMessageByAcc(venues.getPhone());
		re=userdao.insertVenuesdefaultByUid(user);
		if(re){
			if(userdao.updateVenuesDefault(venues)>0){
				for (int i = 0; i < piclist.size(); i++) {
					re=userdao.insertVenusePic(piclist.get(i), venues.getUid());
				}
				if(re){
					userdao.insertAdd(address);
					userdao.roleupdate(role, venues.getUid());
					result="成功";
				}
			}
		}
		return result;
	}

}
