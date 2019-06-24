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



//验证码获取

function registerCode(){
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
}