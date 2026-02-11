package com.jsp.Request_Dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ServletClass extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
			String user = req.getParameter("user");
			String pass = req.getParameter("pass");
			
			PrintWriter pw = resp.getWriter();
			RequestDispatcher rd;
			
			if (user.equals("omkar")&& pass.equals("mane")) {
				 rd = req.getRequestDispatcher("home.html");
			     rd.forward(req, resp);
			} else {
				
				rd = req.getRequestDispatcher("login.html");
				pw.write("somthing woring");
				resp.setContentType("text/html");
				rd.include(req, resp);
				

			}
	}

}
