function register(){
	$.ajax({
		url:"/user/register",
		data:{
			acc:$("#acc").val(),
			pwd:$("#pwd").val(),
			code:$("#code").val(),
		},
		 contentType: "application/json; charset=utf-8",
		success: function(data){
			if(data=="成功"){
				location.href="http://localhost:8080/html/login.html";
			}
		}
	})
}

//验证码获取

function registerCode(){
	var re = 1;
	$.ajax({
		url:"/user/getcode",
		data:{
			acc:$("#acc").val(),
			i:re
		},
		success:function(data){
			alert(data)
		}
	})
}


//重复密码验证
$(function(){
	$("#rpwd").blur(function(){
		var pass=$("#pwd").val();
		var rpass=$("#rpwd").val();
		if(pass!=rpass){
			alert("两次密码不一致");
		}
	})
})

//查询手机号是否被注册
$(function(){
	$("#acc").blur(function(){
		$.ajax({
			url:"/user/checkacc",
			data:{
				acc:$("#acc").val(),
			},
			success:function(data){
				alert(data)
			}
		})
	})
})