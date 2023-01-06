package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class College {

	public static void main(String[] args) {
		String username="root";
		String password="siri@123@S";
		String host="jdbc.mysql://localhost:3306/xworkz";
		
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
			Connection connection= DriverManager.getConnection(host, username, password);
			String query = "insert into college values(?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			
			statement.setString(1, "siri");
			statement.setInt(2, 9);
			statement.setString(3, "ECE");
			statement.setString(4, "A");
			statement.setInt(5, 935360152);
			
			
			statement.executeUpdate();
			statement.close();
			connection.close();
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
