package com.sessionManagement.HiddenForm;

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
		
		
		
		out.println("\r\n"
				+ "<html ><body bgcolor=\"#B18904\">\r\n"
				+ "    <form action=\"servlet2\">\r\n"
				+ "        <input type=\"text\" name=\"username\" value='"+name+"'>\r\n"
				+ "        <button>Go to second servlet</button>\r\n"
				+ "    </form>\r\n"
				+ "</body></html>");
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
