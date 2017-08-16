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
	private VendorService gs = new VendorService();
	private Gson g = new Gson();
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{	
		request.setCharacterEncoding("UTF-8");
		String resultStr = "";
		String params = request.getParameter("param");
	    Goods goods = g.fromJson(params, Goods.class);
	    String command = goods.getCommand();
    	Page page = goods.getPage();
		if(command.equals("view")){ 
	    	Goods resultGoods = gs.selectGoods(goods);
	    	request.setAttribute("page", page); 
	    	request.setAttribute("vendor", resultGoods); 
	    	request.setAttribute("url", "/vendor/vendor_view.jsp");
	    	RequestDispatcher rd=request.getRequestDispatcher("/vendor/vendor_view2.jsp");
	    	try {
				rd.forward(request, response); 
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		request.setCharacterEncoding("UTF-8");
	    
	    Vendor goods = g.fromJson(request.getReader(), Vendor.class);
	    String command = goods.getCommand();
    	Page page = goods.getPage();
	    if(command.equals("list")){
	    	int totalCnt = gs.getTotalCount(goods);
	    	page.setTotalCnt(totalCnt);
	    	List<Vendor> vendorList = gs.selectVendorsList();
	    	HashMap resultMap = new HashMap();
	    	resultMap.put("page", page);
	    	resultMap.put("vendorList", vendorList);
	    	System.out.println(vendorList);
	    	String jsonStr = g.toJson(resultMap);
	    	doProcess(response, jsonStr);
	    }else if(command.equals("view")){

	    }else if(command.equals("delete")){

	    }else if(command.equals("insert")){

	    }else if(command.equals("update")){
	    	 
	    }
	}
	
	public void doProcess(HttpServletResponse response, String writeStr) throws IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print(writeStr);
	}
}