package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resq) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		int result = 0;
		String resultStr = "";
		try {
			int num1 = Integer.parseInt(req.getParameter("num1"));
			int num2 = Integer.parseInt(req.getParameter("num2"));
			String op = req.getParameter("op");
			System.out.println("니가적었어" + num1 + op + num2);

			if (op.equals("+")) {
				result = num1 + num2;
			} else if (op.equals("-")) {
				result = num1 - num2;
			} else if (op.equals("/")) {
				result = num1 / num2;
			} else if (op.equals("*")) {
				result = num1 * num2;

			}
			resultStr = "결과값 = " + result;
		} catch (Exception e) {
			resultStr = "야 너 숫자 입력해야지";
		}
		doProcess(resq, resultStr); // <브라우저에 값 보여주게 해주는넘 메인에서 써야
									// 써먹음.System.out.println이라 보면됨.
	}

	public void dePost(HttpServletRequest req, HttpServletResponse reqs) throws IOException {

	}

	public void doProcess(HttpServletResponse resq, String writeStr) throws IOException {
		resq.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resq.getWriter();
		out.print(writeStr);

	}

}
