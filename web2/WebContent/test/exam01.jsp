<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "exam01_ok.jsp">
<input type = "text" name = "id" id="id"/><br/>
<input type = "text" name = "name" id="name"/><br/>
<input type = "text" name = "age" id="age"/><br/>
<input type = "text" name = "address" id="address"/><br/>
<input type = "text" name = "address2" id="address2"/><br/>
<input type = "text" name = "hp1" id="hp1"/><br/>
<input type = "text" name = "hp2" id="hp2"/><br/>
<input type = "text" name = "hp3" id="hp3"/><br/>
<input type = "text" name = "zipcode" id="zipcode"/><br/>
<input type = "text" name = "password" id="password"/><br/>
<input type = "button"value="값확인"onclick="doCheckValue()"/>
</form>
<script>

var AjaxUtil = function(p_url, params){
	this.params = params;
	
	getHttpXmlObj = function(){
		if(window.XMLHttpRequest){
	  		return new XMLHttpRequest();
	 	}else if(window.ActiveXObject){
	  		return new ActiveXObject("Microsoft.XMLHTTP");
	 	}
		alert("해당 브라우져가  Ajax를 지원하지 않습니다.");
	}
	this.xhr = getHttpXmlObj();
	var method = "get";
	var url = p_url;
	var aSync = true;
	this.xhr.onreadystatechange=function(){
   		if (this.readyState==4){
   			if(this.status==200){  //<-200은 정상이라는뜻.보낸요청에 대한 응답을 받는코드
	   			var result = decodeURIComponent(this.responseText);
	   			document.getElementById("result_div").innerHTML=result;
   			}
   		}
	}
	this.changeCallBack = function(func){
		this.xhr.onreadystatechange = func;
	}
   	this.xhr.open(method, url+this.params, aSync);
   	this.send = function(){
   		this.xhr.send.arguments = this;
   	   	this.xhr.send();
   	}
} 
function doCheckValue(){
	var test1 = document.getElementById("id").value;
	var test2 = document.getElementById("name").value;
	var test3 = document.getElementById("age").value;
	var test4 = document.getElementById("address").value;
	var test5 = document.getElementById("address2").value;
	var test6 = document.getElementById("hp1").value;
	var test7 = document.getElementById("hp2").value;
	var test8 = document.getElementById("hp3").value;
	var test9 = document.getElementById("zipcode").value;
	var test10 = document.getElementById("password").value;
	var params = "?";
	params += "?id=" + id;
	params += "&name=" + name;
	params += "&address=" + address;
 	params += "&test4=" + test4;
 	params += "&test5=" + test5;
 	params += "&test6=" + test6;
 	params += "&test7=" + test7; 
 	params += "&test8=" + test8;
	params += "&test9=" + test9;
	params += "&test10=" + test10;
	var au = new AjaxUtil("/test/exam01_ok.jsp", params);
	au.send();
}
</script>
<div id ="result_div"></</div>
</body>
</html>