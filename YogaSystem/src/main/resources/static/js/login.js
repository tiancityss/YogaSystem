function login(){
	$.ajax({
		url:"/user/login",
		data:{
			acc:$("#acc").val(),
		},
		success:function(data){
			var re=$.isEmptyObject(data);
			alert(data.role)
			if(!re){
				if(data.role==0){
					location.href="http://localhost:8080/html/message.html";
				}else{
					location.href="http://localhost:8080/index.html";
				}
			}else{
				alert("账号或密码错误");
			}
			
			
			
			
		}
	})
}