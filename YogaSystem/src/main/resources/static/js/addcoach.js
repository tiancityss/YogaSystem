function back(){
	var state=confirm("确定要取消吗，刚刚填写的数据将不做保存");
	if(state){
		location.href="http://localhost:8080/index.html";
	}
}

function upload(){
	var formData = new FormData($("#form")[0]);
	/* 	formData.append("type", type);//也可以添加其他字段 */
	alert(1)
			$.ajax({
				type : "post",
				url : "/user/upload",
				data : formData,
				contentType : false,
				processData : false,
				success : function(picadd) {
					if (picadd == null) {
						alert("请选择图片文件");
					}
					var context = '<img id="a" src="'+picadd+'" width="80px";height="80px" ><br>'
							+ '<input type="text" hidden  id="img" value="'+picadd+'" />';
				
					$("#pic").html(context);
				}
			})
}
