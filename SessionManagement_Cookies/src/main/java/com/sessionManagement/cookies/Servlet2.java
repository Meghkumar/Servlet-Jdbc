package com.sessionManagement.cookies;

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
		
		Cookie[] cookies = request.getCookies();
		String name = "";
		boolean f= false;
		if(cookies==null)
		
		{
			out.println("<html ><body bgcolor=\"#B18904\">\r\n"
					+ "        <h1>You are new user please submit your name and comeback </h1>\r\n"
					+ "</body></html>  ");
			return;
		}
		else {
			
			for (Cookie cookie : cookies) {
				
				String tname = cookie.getName();
				if(tname.equals("user_name"))
				{
					f=true;
					name=cookie.getValue();
					
				}
			}
		}
		
		if(f) {
			
			
			out.println("<html ><body bgcolor=\"#B18904\">\r\n"
					+ "            <h1>Welcome "+name+" back to our website </h1>\r\n"
					+ "</body></html>");
		}
		else 
		{
			out.println("<html ><body bgcolor=\"#B18904\">\r\n"
					+ "        <h1>You are new user please submit your name and comeback </h1>\r\n"
					+ "</body></html>  ");
		}
		
		
	
		
		
		
	}

}
