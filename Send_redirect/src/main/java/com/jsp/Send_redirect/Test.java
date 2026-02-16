package com.jsp.Send_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet( value = "/Test")
public class Test extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		resp.sendRedirect("first.html");
		
		PrintWriter pw = resp.getWriter();
		pw.write("This is test servlet class");
		
	}
	
	
}
