package com.qspider.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();
		out.println("<html ><body bgcolor=\"#B18904\">\r\n"
				+ "    <H1 style=\"color: beige; text-align: center; margin-top: 10%;\">Registeration Successfull\r\n"
				+ "    <a href=\"Welcome.html\"><h1 style=\"text-align: center;\"><input type=\"submit\" value=\"Back\" name=\"messageBack\" style=\"font-size: 70%;\" ></h1></a> \r\n"
				+ "</body></html>");

		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "insert into servlet.register values (?,?,?)";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection created");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=megh&password=root");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			pstmt.executeUpdate();
			System.out.println("Data uploaded");
		}

		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}

	}

}
