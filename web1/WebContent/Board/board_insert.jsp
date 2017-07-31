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
<font color="red">
	<form method="get" action="<%=rootPath%>/Board/board_insert_ok.jsp">
		<jsp:include page="/common/top.jsp" flush="fasle"></jsp:include>
		<div class="container">
			<div class="starter-template">
				<table border="1" class='table table-bordered table-hover'>

					<tr>
						<td>제목</td>
						<td><input type="text" name="bititle" id="bititle" /></td>
					</tr>
					<tr>
						<td>내용 :</td>
						<td><textarea name="bicontent" id="bicontent"></textarea></td>
					</tr>
					<tr>
						<td>비번 :</td>
						<td><input type="text" name="bipwd" id="bipwd" /></td>
					</tr>
					<tr>
						<td>글쓴이 :</td>
						<td><input type="text" name="creusr" id="creusr"
							value="<%=userId%>" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="글쓰기" /></td>

					</tr>
				</table>
				</div>
				</div>
				
	</form>
	</font><br> 

</body>
</html>