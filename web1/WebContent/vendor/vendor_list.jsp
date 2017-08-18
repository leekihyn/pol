<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/header.jsp"%>
<div class="container">
	<div class="container" style="text-align: center; padding-top: 20px;padding-bottom: 20px;">
		<label>회사이름 : </label> <input type="text" id="viName" /> 
		<input type="button" id="searchGoods" value="검색" />
	</div> 
	<table id="table" data-height="460"
		class="table table-bordered table-hover">
		<thead>
			<tr> 
				<th data-field="viNum" class="text-center">회사번호</th>
				<th data-field="viName" class="text-center">회사이름</th>
				<th data-field="viDesc" class="text-center">회사설명</th>
				<th data-field="viAddress" class="text-center">회사주소</th>
				<th data-field="viPhone" class="text-center">대표번호</th>
			</tr>
		</thead>
		<tbody id="result_tbody">
		</tbody> 
		<button id="btnInsert" class="btn btn-primary"  type="button">회사등록</button>
	</table>
</div> 
<div class="jb-center" style="text-align: center">
	<ul class="pagination" id="page">
	</ul>  
</div> 
<script> 
var pageInfo = {};
var nowPage = "<%=request.getParameter("nowPage")%>";

if(nowPage=="null"){
	nowPage = "1";
}
$("#btnInsert").click(function(){
	location.href="/vendor/vendor_insert.jsp";
}) 
$("#searchGoods").click(function() {
	var giName = $("#giName").val().trim();
	var viNum = $("#s_vendor").val().trim();
	if(giName=="" && viNum==""){
		alert("회사 선택이나 제품명을 입력해주세요.");
		return;
	}
	var params = {};
	if(giName!=""){
		params["giName"] = giName;
	}
	if(viNum!=""){
		params["viNum"] = viNum;
	}
	params["command"] = "list";
	var page = {};
	page["nowPage"] = nowPage;
	params["page"] = page;
	movePageWithAjax(params, "/list.goods", callback);
});

function callback(results) {
	var pageInfo = results.page;
	var vendorList = results.vendorList;
	//var params = {};
	//makePagination(pageInfo,"page");
	//setEvent(pageInfo,params , "/list.vendors");
	$('#table').bootstrapTable('destroy');
	var resultStr = "";
	for(var i=0, max=vendorList.length;i<max;i++){
		var vendor = vendorList[i];
		resultStr += "<tr data-view='" + vendor.viNum + "'>";
		resultStr +="<td class='text-center'>" + vendor.viNum + "</td>";
		resultStr +="<td class='text-center'>" + vendor.viName + "</td>";
		resultStr +="<td class='text-center'>" + vendor.viDesc + "</td>";
		resultStr +="<td class='text-center'>" + vendor.viAddress + "</td>";
		resultStr +="<td class='text-center'>" + vendor.viPhone + "</td>";
		resultStr +="</tr>";
	}
	$('#result_tbody').html(resultStr);
	$("tbody[id='result_tbody']>tr[data-view]").click(function(){
		var params = {};
		params["viNum"] = this.getAttribute("data-view");
		params["command"] = "view";
		var page = {};
		page["nowPage"] = nowPage;
		params["page"] = page;
		movePageWithAjax(params, "/list.vendor", callBackView);
	})
}
function callBackView(result){
	var url = result.url + "?nowPage=" + result.page.nowPage + "&viNum=" + result.vendorList.viNum;
	url += "&viName=" + result.vendorList.viName;
	url += "&viDesc=" + result.vendorList.viDesc;
	url += "&viAddress=" + result.vendorList.viAddress;
	url += "&viPhone=" + result.vendorList.viPhone; 
	location.href=url;
}

$(document).ready(function() {
	var page = {};
	page["nowPage"] = nowPage;
	var params = {};
	params["page"] = page;
	params["command"] = "list";
	movePageWithAjax(params, "/list.vendor", callback);
});
</script>
</body>
</html>