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
$("#searchGoods").click(function() {
	var viName = $("#viName").val().trim();
	var viNum = $("#s_vendor").val().trim();
	if(viName=="" && viNum==""){
		alert("회사 선택이나 제품명을 입력해주세요.");
		return;
	}
	var params = {};
	if(viName!=""){
		params["viName"] = viName;
	}
	if(viNum!=""){ 
		params["viNum"] = viNum;
	}
	params["command"] = "list";
	var page = {};
	page["nowPage"] = nowPage;
	params["page"] = page;
	movePageWithAjax(params, "/list.vendor", callback);
});

function callback(results) {
	var pageInfo = results.page;
	var vendorList = results.vendorList;
	alert(vendorList[1].viNum);
	alert(vendorList[1].viName);
	alert(vendorList[1].viDesc);
	alert(vendorList[1].viaddress);
	alert(vendorList[1].viphone);
	var params = {}; 
	var resultStr = ""; 
	for(var i=0, max=vendorList.length;i<max;i++){ 
		var goods = vendorList[i];  
		resultStr += "<tr data-view='" + goods.viNum + "'>";
		resultStr +="<td class='text-center'>" + goods.viNum + "</td>";
		resultStr +="<td class='text-center'>" + goods.viName + "</td>";
		resultStr +="<td class='text-center'>" + goods.viDesc + "</td>";
		resultStr +="<td class='text-center'>" + goods.viaddress + "</td>";
		resultStr +="<td class='text-center'>" + goods.viphone + "</td>"; 
		resultStr +="</tr>";
	} 
	$('#result_tbody').html(resultStr);
	$("tbody[id='result_tbody']>tr[data-view]").click(function(){
		var params = {};
		params["viNum"] = this.getAttribute("data-view");
		params["command"] = "view";
		var page = {};
		page["nowPage"] = pageInfo.nowPage;
		params["page"] = page;
		movePageWithAjax(params, "/list.vendor", callBackView); 
	})
}
/* function callBackView(result){
	var url = result.url + "?nowPage=" + result.page.nowPage + "&viNum=" + result.vendor.viNum;
	url += "&viName=" + result.goods.viName; 
	url += "&viDesc=" + result.goods.viDesc;
	url += "&viAddress=" + result.goods.viAddress;
	url += "&viPhone=" + result.goods.viPhone;
	location.href=url;  
} */

$(document).ready(function() {
	var page = {};
	page["nowPage"] = "1";
	var params = {}; 
	params["page"] = page;
	params["command"] = "list";
	movePageWithAjax(params, "/list.vendor", callback); 
});
</script>
</body>
</html>