<%@ include file="/common/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="container-view"> 
		<table id="table"  data-height="460"	class="table table-bordered table-hover">
		<thead> 
			<tr> 
				<th colspan="2" class="text-center"><h5 class="form-signin-heading">상품 등록 페이지</h5></th>
			</tr> 
			<tr>
				<td class="col-md-2">회사이름</td>
				<td class="col-md-4"><input type="text" name="viName" id="viName"></td>
			</tr>
			<tr>
				<td>회사설명</td>
				<td><input type="text" name="viDesc" id="viDesc"></td>
			</tr>
			<tr>
				<td>회사주소</td>
				<td><input type="text" name="viAddress" id="viAddress"></td> 
			</tr>
			<tr> 
				<td>대표자번호</td> 
				<td><input type="text" name="viPhone" id="viPhone"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button id="btnInsert" class="btn btn-primary" 	type="button">상품등록</button>
					<button id="goList" class="btn" 	type="button">취소</button>
				</td>
			</tr>
		</table>
	</div>
	<!-- /container -->

<script>
	$("#btnInsert").click(function(){
		var page = {};
		page["nowPage"] = <%=request.getParameter("nowPage")%>;
		var params = {};
		params["command"] = "insert";
		params["viName"] = $("#viName").val(); 
		params["viDesc"] = $("#viDesc").val(); 
		params["viAddress"] = $("#viAddress").val();
		params["viPhone"] = $("#viPhone").val();
		params["page"] = page; 
		movePageWithAjax(params, "/list.vendor", callbackInsert);  
	}) 
	
	function callbackInsert(result){
		alert(result.msg);
		location.href = result.url + "?nowPage=" +<%=request.getParameter("nowPage")%>;
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
	}
	$("#goList").click(function(){
		location.href = "/vendor/vendor_list.jsp?nowPage=" + <%=request.getParameter("nowPage")%>;
	})
</script>
</body>
</html>