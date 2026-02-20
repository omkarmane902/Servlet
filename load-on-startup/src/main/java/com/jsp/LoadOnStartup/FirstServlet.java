package com.jsp.LoadOnStartup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/start",loadOnStartup = 3)

public class FirstServlet extends HttpServlet {

	
	
	@Override
	public void init() throws ServletException {
		 System.out.println("First Servlet Class Loaded");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("First Servlet service() executed");
        resp.getWriter().println("First Servlet Response");
	}

}
