<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/header.jsp"%>
	<font face="궁서체"> <font color="red"> <font size=3>
<div class="container">
		<div class="starter-template">
			<table border="1" class='table table-bordered table-hover'>
				<tr>
					<td>유저아이디:</td>
					<td><%=userId%></td>
				</tr>
				<tr>
					<td>유저이름:</td>
					<td><%=userName%></td>
				</tr>
				<tr>
					<td>집주소:</td>
					<td><%=address%></td>
				</tr>
				<tr>
					<td>연락처:</td>
					<td><%=hp1%>-<%=hp2%>-<%=hp3%></td>
				</tr>
				<tr>
					<td>나이:</td>
					<td><%=age%></td>
				</tr>
				
			</table> 
				<tr><input type="button" value="게시글 작성" onclick="doMovePage('board_insert.jsp')" /></tr>
				<tr><input type="button" value="메인가기" onclick="doMovePage('main')" /></tr>
			
		</div>
	</div>
	</font> 
	</font>
	</font>
	
	
	
유저인포
