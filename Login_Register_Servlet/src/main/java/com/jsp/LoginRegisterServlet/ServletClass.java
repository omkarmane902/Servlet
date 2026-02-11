package com.jsp.LoginRegisterServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class ServletClass extends HttpServlet {

    public static String storename;
    public static String storepass;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        storename = req.getParameter("user");
        storepass = req.getParameter("pass");
        PrintWriter pw = resp.getWriter();
        if (storename != null && storepass != null && storepass.length() >= 4) {

            RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
            rd.forward(req, resp);

        } else {
        	RequestDispatcher rd = req.getRequestDispatcher("/Register.html");
        	rd.include(req, resp);
            pw.write("Registration Failed!");
        }
    }
}
