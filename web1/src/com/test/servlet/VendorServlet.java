package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.test.dto.Goods;
import com.test.dto.Page;
import com.test.dto.Vendor;
import com.test.service.VendorService;
 
public class VendorServlet extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	private VendorService vs = new VendorService();
	private Gson g = new Gson();	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{	
		request.setCharacterEncoding("UTF-8"); 
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		request.setCharacterEncoding("UTF-8");
	    
	    Vendor vendors = g.fromJson(request.getReader(), Vendor.class);
	    String command = vendors.getCommand();
    	Page page = vendors.getPage();
    	String viNum = request.getParameter("viNum");
	    if(command.equals("list")){
	    	int totalCnt = vs.getTotalCount(vendors);
	    	page.setTotalCnt(totalCnt);
	    	List<Vendor> vendorList = vs.selectVendorsList(vendors);
	    	HashMap resultMap = new HashMap();
	    	resultMap.put("page", page);
	    	resultMap.put("vendorList", vendorList);
	    	System.out.println(vendorList);
	    	String jsonStr = g.toJson(resultMap);
	    	doProcess(response, jsonStr);
	    }else if(command.equals("view")){
	    	Vendor resultVendor = vs.selectVendorsView(vendors);
	    	HashMap resultMap = new HashMap();
	    	resultMap.put("page", page);
	    	resultMap.put("vendorList", resultVendor);
	    	System.out.println(resultVendor);
	    	resultMap.put("url", "/vendor/vendor_view.jsp");
	    	String jsonStr = g.toJson(resultMap);
	    	doProcess(response, jsonStr);
	 }else if(command.equals("delete")){
		 int result = vs.deleteVendors(vendors); 
		 HashMap resultMap = new HashMap(); 
		 resultMap.put("page", page);
		 resultMap.put("msg", "삭제 완룡");
		 resultMap.put("url", "/vendor/vendor_list.jsp");
		 if(result!=1){
			 resultMap.put("msg", "삭제 실팽");
			 resultMap.put("url",""); 
		 }
		 String jsonStr = g.toJson(resultMap);
		 doProcess(response, jsonStr);
		 
	 }else if(command.equals("insert")){
		 int result = vs.insertVendor(vendors);
	    	HashMap resultMap = new HashMap();
	    	resultMap.put("msg", "저장이 완료 되었습니다.");
	    	resultMap.put("url", "/vendor/vendor_list.jsp");
	    	if(result!=1){
		    	resultMap.put("msg", "저장이 실패하였습니다.");
		    	resultMap.put("url", "");
	    	}  
	    	String jsonStr = g.toJson(resultMap);
	    	doProcess(response, jsonStr);
	 }else if(command.equals("update")){
		 int result = vs.updateVendor(vendors);
		 HashMap resultMap = new HashMap();
		 resultMap.put("msg",  "수정이 완료 되었습니다.");
		 resultMap.put("url", "/vendor/vendor_list.jsp");
		 if(result!=1){ 
			 resultMap.put("msg", "수정 실패");
			 resultMap.put("url", "");
			 System.out.println(viNum);
		 }
		 String jsonStr = g.toJson(resultMap);
		 doProcess(response, jsonStr); 
   }  	 
	    
	    }
	
	public void doProcess(HttpServletResponse response, String writeStr) throws IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print(writeStr);
	}
}

 