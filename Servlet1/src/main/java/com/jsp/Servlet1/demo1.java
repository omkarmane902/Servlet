package com.jsp.Servlet1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class demo1  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
           String parameter1 = req.getParameter("username");	
           String parameter2 = req.getParameter("password");
           System.out.println(parameter1);
           System.out.println(parameter2);
	}

}
