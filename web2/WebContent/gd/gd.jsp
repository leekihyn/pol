<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/header.jsp"%>
<font color = "red">
	<div class="container">
		<table id="table" data-height="460" 
			class="table table-bordered table-hover">
			<thead>
				<tr>
					<th data-field="ginum"  class="text-center">번호</th>
					<th data-field="giname"  class="text-center">모델</th>
					<th data-field="gidesc"  class="text-center">회사</th>
					<th data-field="vinum"  class="text-center">지역</th>
					<th data-field="gicredat"  class="text-center">날짜</th>
					<th data-field="gicretim"  class="text-center">시간</th>
				</tr>
			</thead> 
			<tbody id="result_tbody">   
			</tbody>
		</table> 
	</div>
	
	<select id="s_vendor">
	   <option value="">회사선택</option>
	</select> 
연산자 :
<input type="text" id="op" />
<input type="button" id="getCal" value="리스트호출" />
<div id="result_div" class="container"></div>

<script>


$("#getCal").click(function(){
	var op = $("#s_vendor").val();
	var param = {};
	param["vinum"] = op; 
	param = JSON.stringify(param);
	
	var a = { 
	        type     : "POST"
	    	    ,   url      : "/vd/vd_select.jsp"
	    	    ,   dataType : "json" 
	    	    ,   beforeSend: function(xhr) {
	    	        xhr.setRequestHeader("Accept", "application/json");
	    	        xhr.setRequestHeader("Content-Type", "application/json");
	    	    }
	 ,   data     : param 
	    ,   success : function(result){
 	        $("#table").bootstrapTable({
 	            data: result
 	        }); 
	    	    ,   error : function(xhr, status, e) {
	    		    	alert("에러 : "+e);
	    		},
	    		complete : function() {
	    			alert("실패던 성공이던 난 실행이다.");
	    		}
	    		};
	$.ajax(a);
});

</script>
</font>
</body> 
</html>