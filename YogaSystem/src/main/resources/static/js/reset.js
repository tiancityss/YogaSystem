function reset(){
	$.ajax({
		url:"/user/reset",
		data:{
			acc:$("#acc").val(),
			pwd:$("#pwd").val(),
			code:$("#code").val(),
		},
		 contentType: "application/json; charset=utf-8",
		 success: function(data){
			 alert(1)
				if(data=="成功"){
					location.href="http://localhost:8080/html/login.html";
					alert(1)
				}
			}
	})
}

//重复密码验证
$(function(){
	$("#rpwd").blur(function(){
		var pass=$("#pwd").val();
		var rpass=$("#rpwd").val();
		if(pass!=rpass){
			//alert("两次密码不一致");
			var con="";
			con+=' <a id="mes" style="color: #6F89B4">两次密码不一致</a>';
			$("#mes").html(con)
		}
	})
})





//验证码获取

function registerCode(val){
	var re = 2;
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
	settime(val);
}

//验证码倒计时
var countdown=60;
function settime(val) {
	if (countdown == 0) {
	val.removeAttribute("disabled");
	val.value="获取验证码";
	countdown=60;
	} else {
	val.setAttribute("disabled", true);
	val.value="重新发送(" + countdown + ")";
	countdown--;
	setTimeout(function() {
	settime(val)
	},1000)
	}
	}