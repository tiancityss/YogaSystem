package com.woniuxy.yogasystem.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.woniuxy.yogasystem.pojo.User;
import com.woniuxy.yogasystem.service.UserService;
import com.woniuxy.yogasystem.util.CodeUtil;


@Controller
@RequestMapping("/user")
public class UserController {
@Resource
private UserService userService;	

//注册
@RequestMapping("/register")
@ResponseBody
public String register(HttpServletRequest request,String code,User user){
	String result ="失败";
	System.out.println(user);
	//System.out.println(i);
	System.out.println(code);
	 HttpSession session= request.getSession();
	 Object reCode=session.getAttribute("code");
	 String realCode=(String) reCode;
	 if(code.equals(realCode)){
		 session.removeAttribute("code");
		if( userService.register(user)){
			 result="成功";
		}
	 }
	return result;
}

//验证码
@RequestMapping("/getcode")
@ResponseBody
public String getCode(HttpServletRequest request,User user,int i) throws ClientException{
	String result="短信发送失败";
	int g = (int)((Math.random()*9+1)*1000);
    String code = Integer.toString(g);
    HttpSession session= request.getSession();
    session.setAttribute("code", code);
    System.out.println("发送的验证码为：" + code);
    System.out.println("接收到的验证码类型为" + i);
	/* SendSmsResponse response = CodeUtil.sendSms(user.getAcc(), code, i);
	 if(response.getMessage().equals("OK")){
		 result= "短信发送成功！" ;
		 return result;
	 }*/
    
	 
	return "短信发送成功";
}

//检查注册手机号是否重复
@RequestMapping("/checkacc")
@ResponseBody
public String checkAcc(String acc){
	String result="请输入合法的账户";
	if(acc.isEmpty()){
		return result;
	}else{
		result=userService.checkacc(acc);
	}
	
	return result;
	
}

//登录
@RequestMapping("/login")
@ResponseBody
public User login(HttpServletRequest request,User user){
	System.out.println("用户账号"+user.getAcc());
	User user2=null;
	user2=userService.login(user);
	HttpSession session= request.getSession();
    session.setAttribute("uid", user2.getId());
    session.setAttribute("acc", user2.getAcc());
	System.out.println(user2);
	return user2;
	
}
}
