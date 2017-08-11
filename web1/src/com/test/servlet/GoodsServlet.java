package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.test.dto.Goods;
import com.test.service.GoodsService;

public class GoodsServlet extends HttpServlet { 
  
	private static final long serialVersionUID  = 1L;
	private GoodsService gs = new GoodsService();
 
	public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8");
		String resultStr = "";
		doProcess(response, resultStr); 
	} 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");  
		Gson g = new Gson();
		Goods goods = g.fromJson(request.getReader(), Goods.class); 
		System.out.println(goods);
		String command = goods.getCommand();
		if(command.equals("list")){
			 
		}
}  
 
	public void doProcess(HttpServletResponse response, String writeStr) throws IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print(writeStr);

	}
}