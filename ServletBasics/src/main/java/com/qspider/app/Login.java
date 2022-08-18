package com.qspider.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String username= request.getParameter("loginusername");
		String userpassword= request.getParameter("loginpassword");
		
		PrintWriter out = response.getWriter();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select name from servlet.register where name=? and password=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection created");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=megh&password=root");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, userpassword);
			
			rs=pstmt.executeQuery();
			System.out.println("Resultset created");
			
			if(rs.next())
			{
				RequestDispatcher rd = request.getRequestDispatcher("Success.html");
						rd.forward(request, response);
			}
			
			else {
				out.println("<html ><body bgcolor=\"#B18904\">\r\n"
						+ "    <H1 style=\"color: beige; text-align: center; margin-top: 10%;\">Login Failed Please Check the Details\r\n"
						+ "    <a href=\"Welcome.html\"><h1 style=\"text-align: center;\"><input type=\"submit\" value=\"Back\" name=\"messageBack\" style=\"font-size: 70%;\" ></h1></a> \r\n"
						+ "</body></html>");
				
			
			}
			
		}

		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		
		
		
		
		finally {
			
			if(rs!=null) {
				try {
					rs.close();
				}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			if(con!=null) {
				try {
					con.close();
				}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
		}

	}
		
		
	}

	

