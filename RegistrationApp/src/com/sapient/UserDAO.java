package com.sapient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		System.out.println(dao.checkUserExists("ravi"));
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Load the Driver...");

		try {
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/sapientdemodb",
							"root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Created...");
		return con;
	}

	

	public boolean checkUserExists(String username) {
		Connection con = getConnection();
		ResultSet rs = null;		
		boolean result = false;	
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("select * from User where username=?");
			stmt.setString(1, username);	
			rs = stmt.executeQuery();		
			while(rs.next()){
				//String pwd = rs.getString("password");			
//				if(user.getPwd().equals(pwd)){
					return true;
//				}			
			}			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				stmt.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

}