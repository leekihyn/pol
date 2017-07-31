<%@ include file="/common/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.test.common.DBConn2"%>
<%@ page import="com.test.dto.UserInfo"%>
<%
String biTitle = request.getParameter("bititle");
String biContent = request.getParameter("bicontent");
String biPwd = request.getParameter("bipwd");
String creusr = request.getParameter("creusr");
String tableName = request.getParameter("tableName");
String sql = "insert into board_info(bititle, bicontent, bipwd, creusr,credat)";
sql += " values(?,?,?,?,now())";

Connection con = null;
PreparedStatement ps = null;
String result = "저장 안됫어 다시해";
int resultNum =0;
try{
	con = DBConn2.getCon();
	ps = con.prepareStatement(sql);
	ps.setString(1, biTitle);
	ps.setString(2, biContent);
	ps.setString(3, biPwd);
	ps.setString(4, creusr);
	resultNum = ps.executeUpdate();
	if(resultNum==1){
		result = "저장 됫어.";
		con.commit();
	}
}catch(Exception e){
	System.out.println(e);
}finally{
	if(ps!=null){
		ps.close();
		ps = null;
	}
	DBConn2.closeCon();
}
%>
<script>
alert("<%=result%>");
if(<%=resultNum%> == 1){
	location.href= "<%=rootPath%>/Board/board_select.jsp";
}else{
	history.back();
}
</script>