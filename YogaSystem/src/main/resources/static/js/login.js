function login() {
	$.ajax({
		url : "/user/login",
		data : {
			acc : $("#acc").val(),
		},
		success : function(data) {
			var re = $.isEmptyObject(data);
			alert(data.role)
			if (!re) {
				if (data.role == 0) {
					location.href = "http://localhost:8080/html/message.html";
				} else if(data.role == 1){
					location.href = "http://localhost:8080/html/addmanager.html";
				}else if(data.role==4){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.role==2){
					location.href = "http://localhost:8080/html/_header.html";
				}else if(data.role==3){
					location.href = "http://localhost:8080/html/_header.html";
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