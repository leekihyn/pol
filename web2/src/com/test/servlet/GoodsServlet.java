package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.test.dto.Goods;
import com.test.dto.Page;
import com.test.services.GoodsService;

public class GoodsServlet extends HttpServlet{
	
	 
	private static final long serialVersionUID = 1L;
	private GoodsService gs = new GoodsService();
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{	
		request.setCharacterEncoding("UTF-8");
		String resultStr = "";
		doProcess(response, resultStr);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		request.setCharacterEncoding("UTF-8");
	    Gson g = new Gson();	    
	    Goods goods = g.fromJson(request.getReader(), Goods.class);
	    System.out.println(goods);
	    String command = goods.getCommand();
	    if(command.equals("list")){
	    	int totalCnt = gs.getTotalCount(goods);
	    	Page page = goods.getPage();
	    	page.setTotalCnt(totalCnt);
	    	List<Goods> list = gs.selectGoodsList(goods);
	    	HashMap resultMap = new HashMap();
	    	resultMap.put("page", page);
	    	resultMap.put("list", list);
	    	String jsonStr = g.toJson(resultMap);
	    	System.out.println(jsonStr);
	    	doProcess(response, jsonStr); 
	    }
	}
	
	public void doProcess(HttpServletResponse response, String writeStr) throws IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print(writeStr);
	}
}