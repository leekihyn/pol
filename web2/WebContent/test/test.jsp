<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String url = "/test/top2.jsp";
%>
<jsp:include page="<%=url %>"flush="false">
<jsp:param name="test"value="너너너"/>
</jsp:include>
아래
</body>
</html>