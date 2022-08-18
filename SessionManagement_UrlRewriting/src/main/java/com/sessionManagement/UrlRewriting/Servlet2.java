package com.sessionManagement.UrlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter out = response.getWriter();
		String name1 = request.getParameter("user");
		
		out.println("<html ><body bgcolor=\"#B18904\">\r\n"
				+ "<h1>Welcome to Servlet2</h1></body></html>");
		
		out.println("<html ><body bgcolor=\"#B18904\">\r\n"
				+ "Welcome back to our website "+name1+"</body></html>");


	
		
		
		
	}

}
