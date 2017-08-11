\<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/header.jsp"%>
<font color = "red">
	<div class="container">
		<table id="table" data-height="460"
			class="table table-bordered table-hover">
			<thead>
				<tr>
					<th data-field="jtnum"  class="text-center">번호</th>
					<th data-field="jttext"  class="text-center">지역</th>
					<th data-field="jtname"  class="text-center">이름</th>
					<th data-field="jteamil"  class="text-center">이메일</th>
				</tr>
			</thead> 
			<tbody id="result_tbody">   
			</tbody>
		</table> 
	</div>
	</font>
연산자 : <input type="text" id="op"/><input type="button" id="getCal" value="계산리스트호출"/>
<div id="result_div" class="container"></div>
<script>
$("#getCal").click(function(){
	var op = $("#op").val();
	var param = {};
	param["op"] = op; 
	param = JSON.stringify(param);
	var a = { 
	        type     : "POST"
	    	    ,   url      : "/jt/jt_select.jsp"
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
	    	    }
	    	    ,   error : function(xhr, status, e) {
	    		    	alert("에러 : "+e);
	    		},
	    		done : function(e) {
	    		}
	    		};
	$.ajax(a);
});

</script>
</body>
</html>