package com.woniuxy.yogasystem.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.yogasystem.dao.Coach_VenuesDao;
import com.woniuxy.yogasystem.dao.Trainee_VenuesDao;
import com.woniuxy.yogasystem.dao.VenuesDao;
import com.woniuxy.yogasystem.pojo.Coach;
import com.woniuxy.yogasystem.pojo.Coach_Venues;
import com.woniuxy.yogasystem.pojo.Request_Message;
import com.woniuxy.yogasystem.pojo.Trainee;
import com.woniuxy.yogasystem.pojo.Trainee_Venues;
import com.woniuxy.yogasystem.pojo.Venues;
import com.woniuxy.yogasystem.service.VenuesService;
@Service
public class VenuesServiceImp implements VenuesService{
	@Resource
	private VenuesDao venuesDao;
	@Resource
	private Coach_VenuesDao coach_VenuesDao;
	@Resource
	private Trainee_VenuesDao trainee_VenuesDao;
	
	//搜索学员功能
	@Override
	public List<Trainee> findManyTraineeMsg(Trainee trainee) {
		return venuesDao.findManyTraineeMsg(trainee);
	}
	
	//搜索教练功能
	@Override
	public List<Coach> findManyCoachMsg(Coach coach) {
		return venuesDao.findManyCoachMsg(coach);
	}
	
	//查看我签约的学员
	@Override
	public List<Trainee> findSignTraineeMsg(int uid) {
		return venuesDao.findSignTraineeMsg(uid);
	}
	
	//查看我签约的场馆
	@Override
	public List<Coach> findSignCoachMsg(int uid) {
		return venuesDao.findSignCoachMsg(uid);
	}
	
	//签约教练发送的请求的消息
	@Override
	public String sendCoachMsg(Venues venues,int uid2,int price) {
		int uid1 = venues.getUid();//会馆id
		String content = venues.getName()+"邀请了您";
		Request_Message rm = new Request_Message();
		rm.setContent(content);
		rm.setUid1(uid1);
		rm.setUid2(uid2);
		rm.setName(venues.getName());
		rm.setPrice(price);
		rm.setCharacter(2);
		rm.setType(0);
		//将消息内容插入数据库中
		venuesDao.insertCoachMsg(rm);
		return "邀请成功";
	}
	//展示通知消息
	@Override
	public List<Request_Message> findMsgContent(int uid) {
		return venuesDao.findMsgContent(uid);
	}

	//接受教练申请消息
	@Override
	public String acceptCoachMsg(int vid, int cid,int id) {
		//查看教练身份，分配工资
		String status = coach_VenuesDao.findCoachstatusByCid(cid);
		Coach_Venues cv = new Coach_Venues();
		if(status.equals("兼职")){
			cv.setSalary(200);
		}
		if(status.equals("全职")){
			cv.setSalary(1000);
		}
		if(status.equals("代课")){
			cv.setSalary(500);
		}
		cv.setCid(cid);
		cv.setVid(vid);
		//将信息插入教练签约工资表==签约成功
		coach_VenuesDao.insertMsg(cv);
		//接受到的消息处理之后将flag=1
		venuesDao.handleAllMsg(id);
		//向教练发送消息
		Request_Message rm = answerMsg(vid, cid);
		venuesDao.insertCoachMsg(rm);
		return "签约成功";
	}	
	//接受学员申请消息
		@Override
		public String acceptTrainMsg(int vid, int tid, int id) {
			//插入学员和场馆关系信息表==签约成功
			Trainee_Venues tv = new Trainee_Venues();
			trainee_VenuesDao.insertMsg(tv);
			//接受到的消息处理之后将flag=1
			venuesDao.handleAllMsg(id);
			//向学员发送消息
			Request_Message rm = answerMsg(vid, tid);
			venuesDao.insertCoachMsg(rm);
			return "签约成功，消息已发送";
		}
	//拒绝教练申请或者拒绝学员申请消息
	public String refuseMsg(int vid,int uid,int id){
		//接受到的消息处理之后将flag=1
		venuesDao.handleAllMsg(id);
		//向学员或者教练发送消息
		Request_Message rm = refuseMsg(vid,uid);
		venuesDao.insertCoachMsg(rm);
		return "拒绝成功，消息已发送";
	}
	//接受请求回馈语言
	public Request_Message answerMsg(int vid,int uid){
		Request_Message rm = new Request_Message();
		rm.setUid1(vid);
		rm.setUid2(uid);
		Venues venues = venuesDao.findVenuesMsg(vid);
		String content = venues.getName()+"接受了您的请求";
		rm.setContent(content);
		rm.setType(0);
		rm.setCharacter(2);
		return rm;
	}
	//拒绝请求回馈的消息
	public Request_Message refuseMsg(int vid,int uid){
		Request_Message rm = new Request_Message();
		rm.setUid1(vid);
		rm.setUid2(uid);
		Venues venues = venuesDao.findVenuesMsg(vid);
		String content = venues.getName()+"拒绝了您的请求";
		rm.setContent(content);
		rm.setType(0);
		rm.setCharacter(2);
		return rm;
	}
	
}
