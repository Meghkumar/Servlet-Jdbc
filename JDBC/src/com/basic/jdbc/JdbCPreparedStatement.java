package com.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbCPreparedStatement {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID");
		int id = sc.nextInt();
		
		System.out.println("Enter your Name");
		String name= sc.next();
		
		System.out.println("Enter your Post");
		String post= sc.next();
		

		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "insert into jdbc.employee values (?,?,?)";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection created");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=megh&password=root");

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3,post);
			
			pstmt.executeUpdate();
			System.out.println("Data uploaded");
		}

		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		finally {
			
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



