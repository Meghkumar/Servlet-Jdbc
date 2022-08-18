package com.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatement {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		String query = "insert into jdbc.employee values (4,'rohit', 'developer')";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection created");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=megh&password=root");

			stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Data uploaded");
		}

		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		finally {
			
			if(stmt!=null) {
				try {
					stmt.close();
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
