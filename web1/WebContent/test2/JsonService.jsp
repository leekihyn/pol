<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
<script>
var testParam1 = {};
testParam1["giNum"] = "1";
testParam1["giName"] = "상품";   
testParam1["giDesc"] = "상품설명";
testParam1["viNum"] = "1";
testParam1["viName"] = "상품설명";
testParam1["viList"] = [{str1:"1"},{str2:"2"}];   

var testParam2 = {};
testParam2["giNum"] = "2"; 
testParam2["giName"] = "상품"; 
testParam2["giDesc"] = "상품설명";
testParam2["viNum"] = "2";
testParam2["viName"] = "회사명";
testParam2["viList"] = [{str1:"1"},{str2:"2"}];
function callback(results){
	for(var i=0, max = results.length;i<max;i++){
		var result = results[i];
		alert(result.giDesc);
	}
}
goPage([testParam1, testParam2], "/test.goods", callback);
</script>

</body>
</html>