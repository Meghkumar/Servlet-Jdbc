package com.sessionManagement.UrlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name = request.getParameter("username");
		PrintWriter out = response.getWriter();
		
		
		
		out.println("<html ><body bgcolor=\"#B18904\">\r\n"
				+ "    <h1>Your name is " +name+"</h1>\r\n"
				+ "    <a href='servlet2?user="+name+"'>Go to second servlet</a>\r\n"
				+ "</body></html> ");
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
