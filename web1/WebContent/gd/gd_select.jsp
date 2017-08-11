<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.test.common.DBConn2"%>
<%@ page import="com.google.gson.*"%>
<%@ page import="java.util.*"%>
<%
	 Gson g = new Gson();
	 HashMap<String,String> hm = g.fromJson(request.getReader(), HashMap.class);
	Connection con = null; 
	PreparedStatement ps = null;
	ResultSet rs = null;	
	ArrayList<Map<String, String>> calList = new ArrayList<Map<String, String>>();
	try{
		con = DBConn2.getCon();
		String sql = "select vinum,viname from vendor_info"; 

		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()){
			Map<String, String>rhm = new HashMap<String, String>();
			rhm.put("vinum", rs.getString("vinum"));
			rhm.put("viname", rs.getString("viname"));
			calList.add(rhm);
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

String json = g.toJson(calList);
out.print(json);
	%>