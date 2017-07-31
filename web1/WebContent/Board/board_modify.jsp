<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/header.jsp"%>
    <%@ page import="java.sql.*" %>
<%@ page import="com.test.common.DBConn2" %>
<%@ page import="com.test.dto.BoardInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>


<%

	int pBinum = Integer.parseInt(request.getParameter("binum"));
	String pBiPwd = request.getParameter("bipwd");
	Connection con = null;
	PreparedStatement ps = null;
	int binum = 0;
	String bititle = "";
	String bicontent = "";
	String bipwd = "";
	String creusr = "";
	String credat = "";
	try{
		con = DBConn2.getCon();
		String sql = "select binum, bititle, bicontent, bipwd, creusr,credat from board_info where binum=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1,pBinum);
		ResultSet rs = ps.executeQuery();
		rs.last();
		int rowCnt = rs.getRow();
		if(rowCnt==0){	
			%>
			<script>
			alert("<%=pBinum%>번 이미 지웟어");
			history.back();
		</script>
	<% 
		}
		rs.beforeFirst();
		while(rs.next()){
			binum = rs.getInt("binum");
			bititle = rs.getString("bititle");
			bicontent = rs.getString("bicontent");
			creusr = rs.getString("creusr");
			credat = rs.getString("credat");
			bipwd = rs.getString("bipwd");
			if(!bipwd.equals(pBiPwd)){
%>
	<script>
					alert("<%=pBinum%>번 게시물 비번 틀렷어!!");
					history.back();
				</script>
				<% 
				}
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

<body>
	<form method="get" action="<%=rootPath%>/Board/board_modify_ok.jsp">
		<font color="red"> 
			<jsp:include page="/common/top.jsp" flush="fasle"></jsp:include>
	<div class="container">
		<div class="starter-template">
			<table border="2" class='table table-bordered table-hover'>

				<tr>
					<td>게시물번호:</td>
					<td><%=binum%></td>
					
				</tr>
				<tr>
					<td>제목:</td>
					<td><input type="text" name="bititle" id="bititle" value="<%=bititle%>" /></td>
				</tr>
				<tr>
					<td>내용:</td>
					<td><textarea name="bicontent" id="bicontent" value="<%=bicontent%>"></textarea></td>
				</tr>
				<tr>
					<td>글쓴이:</td>
					<td><input type="text" name="creusr" id="creusr" value="<%=creusr%>" /></td>
				</tr>
				<tr>
					<td>생성일자:</td>
					<td><%=credat%></td>
				</tr>
				<tr>
				<td>비밀번호:</td>
				<td><input type="password" name="bipwd" id="bipwd" /></td>
				
			</table>
		</div>
	</div>
			<td><input type="hidden" value="<%=binum%>" name="binum"/></td>
			<td><input type="submit" value="수정하기"/></td>
			</tr>
			
		
	</font>		
</table>
</form>
</body>
</div>
</div>
</form>


</body>
</html>