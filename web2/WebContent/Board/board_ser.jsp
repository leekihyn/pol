<%@page import="java.sql.*"%>
<%@page import="com.test.common.DBConn2"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.test.dto.BoardInfo"%>
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
		String biTitle = request.getParameter("bititle");

		String result = "";
		if (biTitle != null) {
			BoardInfo bi = new BoardInfo();
			bi.setBiTitle("%" + biTitle + "%");
			

			out.println(result);
		} else {
			// 세션 초기화
			session.invalidate();
		}
	%>
	<script>
	var result = "<%=result%>";
	
		if (result != "") {
			alert(result);
		}
		location.href = "/board/board_select.jsp";
	</script>
</body>
</html>