function back(){
	var state=confirm("确定要取消吗，刚刚填写的数据将不做保存");
	if(state){
		location.href="http://localhost:8080/index.html";
	}
}
