$(function(){
	$.ajax({
		url:"/user/modifyvenues",
		success: function(data){
			
			console.info(data.message)
			var pic="";
			var uname="";
			var usalry="";
			var udescrie="";
			pic+='<img  src="'+data.message.img+'" width="80px";height="80px">'
			uname+= '<label for="userName3">User Name*</label>'+
				'<input type="text" name="nick" required placeholder="Enter user name" class="form-control" id="name" value="'+data.message.name+'">'
			usalry+= ' <label for="salary">收费标准 *</label>'+'<input id="salary" type="text" name="salary" Placeholder="收费标准人民币" class="form-control" value="'+data.message.salary+'">'
			udescrie+='<label for="TextArea">描述*</label>'
            +'<textarea class="form-control" id="TextArea" cols="25" rows="2"  >'+data.message.descrie+'</textarea>'
				$("#pic").html(pic);
				$("#venuesName").html(uname)
				$("#venuesSalary").html(usalry)
				$("#venuesDes").html(udescrie)
		}
		
	})
})