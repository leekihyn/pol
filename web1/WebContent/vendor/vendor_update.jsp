<%@ include file="/common/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.test.common.DBConn"%>
<%@ page import="com.test.dto.UserInfo"%>

	<div class="container-view"> 
		<table id="table"  data-height="460"	class="table table-bordered table-hover">
		<thead>
			<tr>    
				<th colspan="2" class="text-center"><h5 class="form-signin-heading">상품상세 페이지</h5></th>
			</tr>
			<tr>
				<td class="col-md-2">상품번호</td>
				<td class="col-md-4"><%=request.getParameter("viNum") %></td>
			<tr>
				<td>회사이름</td>  
				<td><input type="text" name="num" id="viName" value ="<%=request.getParameter("viName")%>"><br /></td>
			</tr> 
			<tr>
				<td>회사설명</td>
				<td><input type="text" name="num" id="viDesc" value = <%=request.getParameter("viDesc") %>><br /></td>
			</tr>
			<tr> 
				<td>회사주소</td>
				<td><input type="text" name="num" id="viAddress" value = <%=request.getParameter("viAddress") %>><br /></td>	 		
				</tr>
			<tr> 
				<td>대표번호</td>
				<td><input type="text" name="num" id="viPhone" value = <%=request.getParameter("viPhone") %>><br /></td>	 		
				</tr> 
			
			<tr>
				<td colspan="2">
					<button id="btnUpdate" class="btn btn-lg btn-primary btn-block" 	type="button">수정 완료</button>
					<button id="btncancel" class="btn btn-lg btn-primary btn-block" 	type="button">취소</button>
					
				</td>  
			</tr> 
		</table>
	</div>
	<!-- /container -->

<script>
$("#btnUpdate").click(function(){  
	var params = {};
	params["command"] = "update"; 
	params["viName"] = $("#viName").val();
	params["viDesc"] = $("#viDesc").val();
	params["viAddress"] = $("#viAddress").val(); 
	params["viPhone"] = $("#viPhone").val();  
	movePageWithAjax(params, "/list.vendor", callbackInsert); 
})

$("#btncancel").click(function(){
	location.href = "vendor_list.jsp?nowPage=" + <%=request.getParameter("nowPage")%>; 
	
})

$(document).ready(function(){
	var params = {};
	params["command"] = "vendorlist"; 
	movePageWithAjax(params, "/list.vendor", callback);
})

function callbackInsert(result){
	alert(result.msg);
	location.href = result.url;
}
function callback(result){
	var vendorList = result.vendorList;
	var selStr = "<option value=''>회사선택</option>";
	for (var i = 0, max = vendorList.length; i < max; i++) {
		var vendor = vendorList[i];
		selStr += "<option value='" + vendor.viNum + "' >" + vendor.viName
				+ "</option>";
	}
	$("#s_vendor").html(selStr);

	var params = {};
	params["command"] = "view";
	params["giNum"] = "<%=request.getParameter("giNum")%>";
	var page = {}
	page["nowPage"] = "<%=request.getParameter("nowPage")%>";
	params["page"] = page;
	movePageWithAjax(params, "/list.vendor", callback2);
} 
function callback2(result){
	$("#giDesc").val(result.goods.giDesc);
	$("#giName").val(result.goods.giName);
	$("#s_vendor").val(result.goods.viNum);
}
</script>
</body>
</html>