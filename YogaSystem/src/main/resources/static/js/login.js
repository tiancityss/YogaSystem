function login() {
	$.ajax({
		url : "/user/login",
		data : {
			acc : $("#acc").val(),
		},
		success : function(data) {
			var re = $.isEmptyObject(data);
			if (!re) {
				//0学员 1教练 2场馆 3管理 4超管  5游客
				if (data.role == 5) {
					location.href = "http://localhost:8080/html/message.html";
				} else if(data.role == 4){
					location.href = "http://localhost:8080/html/addmanager.html";
				}else if(data.role==0){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.role==1){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.role==2||data.role==6){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.role==3){
					location.href = "http://localhost:8080/html/applymessage.html";
				}
			} else {
				alert("账号或密码错误");
			}

		}
	})
}

function register(){
	location.href = "http://localhost:8080/html/register.html";
}