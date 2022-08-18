package com.sessionManagement.cookies;

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
				+ "            <h1>Welcome "+name+" to our website </h1>\r\n"
				+ "</body></html>");
		
		out.println("<html ><body bgcolor=\"#B18904\">\r\n"
				+ "            <h1><a href=\"Servlet2\">Go to servlet 2</a></h1>\r\n"
				+ "</body></html>");
		
		Cookie c =new Cookie("user_name", name);
		
		response.addCookie(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
