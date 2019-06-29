function login() {
	$.ajax({
		url : "/user/meslogin",
		data : {
			acc : $("#acc").val(),
			code:$("#code").val(),
		},
		success : function(data) {
			var re = $.isEmptyObject(data.user);
			//alert(data.reuslt)
			if (!re) {
				//0学员 1教练 2场馆 3管理 4超管  5游客
				if (data.user.role == 5) {
					location.href = "http://localhost:8080/html/message.html";
				} else if(data.user.role == 4){
					location.href = "http://localhost:8080/html/addmanager.html";
				}else if(data.user.role==0){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.user.role==1){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.user.role==2||data.role==6){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.user.role==3){
					location.href = "http://localhost:8080/html/applymessage.html";
				}
			} else {
				//alert("账号或密码错误");
				var con="";
				con+=' <a id="mes" style="color: red">'+data.result+'</a>';
				$("#mes").html(con)
			}

		}
	})
}


//验证码获取

function registerCode(val){
	var re = 3;
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
var countdown=5;
function settime(val) {
	if (countdown == 0) {
	val.removeAttribute("disabled");
	val.value="获取验证码";
	countdown=5;
	} else {
	val.setAttribute("disabled", true);
	val.value="重新发送(" + countdown + ")";
	countdown--;
	setTimeout(function() {
	settime(val)
	},1000)
	}
	}