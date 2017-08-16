/**
 * 
 */

// var AjaxUtil = function(){
// var str = "문자겠지?";
// this.str2 = "나도 문자얌";
//	
// this.alertVar = function(){
// alert(str);
// alert(this.str2);
// }
// this.getStr = function(){
// return str;
// }
//	
// }
//
// var au = new AjaxUtil();
// alert(au.getStr());
// alert(au.str2);

var AjaxUtil = function(url, arrParams, method, aSync) {
	this.fAction = url;
	this.fMethod = method ? method : "get";
	var params = "?action=LoGIN&id=" + encodeURIComponent(userid);
	this.fASync = aSync ? aSync : ture;
	var sync = true; //true 면 비동기 false면은 동기
	xmlHttpObj.onreadystatechange = function() {
		if (xmlHttpObj.readyState == 4 && xmlHttpObj.status == 200) {
			var result = decodeURIComponent(xmlHttpObj.responseText);
			if (result == "success") {
				location.href = "../user/welcome.jsp"
			} else {
				alert(result);

			}
		}
	}
	xmlHttpObj.open(method, url + params, sync);
	if (method == "get") {
		xmlHttpObj.setRequesHeader("Content-type",
				"application/x-www-form-urlencoded");
	}
	xmlHttpObj.send(params);

}
