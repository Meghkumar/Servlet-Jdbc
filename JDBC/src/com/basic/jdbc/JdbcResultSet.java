package com.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcResultSet {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID");
		int id = sc.nextInt();
		

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from jdbc.employee where id=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection created");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=megh&password=root");

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			
			rs=pstmt.executeQuery();
			System.out.println("Resultset created");
			
			while(rs.next())
			{
				String name = rs.getString(2);
				String post= rs.getString(3);
				
				System.out.println("Emp name is "+name+ " and post is "+post);
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
