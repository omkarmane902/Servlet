package com.jsp.ServletLifeCycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/send")
public class Servlet_Life_Cycle1  implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
            System.out.println("Object is initalized by init()");		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			System.out.println("service() executed...");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
        System.out.println("Destory() executed...");		
	}

}
