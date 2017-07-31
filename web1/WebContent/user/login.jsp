<%@ include file="/common/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.test.common.DBConn2"%>
<%@ page import="com.test.dto.UserInfo"%>
<link rel="stylesheet" href="<%=rootPath%>/ui/signin.css" />
<body>
	<jsp:include page="/common/top.jsp" flush="false">
		<jsp:param name="login" value="<%=login%>"></jsp:param>
	</jsp:include>
	<div class="container">
	<center><img src ="http://cafefiles.naver.net/20120905_61/nikeorb_1346842544358Q8NTE_JPEG/fizz_splash_3.jpg"/>
		<form class="form-signin" action="<%=rootPath%>/user/login_ok.jsp">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="inputEmail" class="sr-only">Email address</label> <input
				type="text" id="id" name="id" class="form-control" placeholder="아이디"
				required autofocus> <label for="inputPassword"
				class="sr-only">Password</label> <input type="password" name="pwd"
				id="pwd" class="form-control" placeholder="비밀번호" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					아이디 저장
				</label>
			</div>
			<button id="btn2"class="btn btn-lg btn-primary btn-block" type="button">접속하기</button>
			<button class="btn btn-lg btn-primary btn-block" type="submit">접속하기2</button>
		</form>

	</div>
	<!-- /container -->
	<script>
	/*var gIot = function(id){
		return document.getElementById(id);
	}
	alert(gIot("btn2").type);*/
	
// 	$("button").click(function(){
// 		alert(1);
// 	});
// 	$("%btn1").click(function(){
// 		alert(2);
// 	});
	</script>
</body>
</html>