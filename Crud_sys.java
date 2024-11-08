package com.org.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud_sys {
	public static void main(String[] args) throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crude_","root","Nisha@123");
		System.out.println("connection successfully....");
		/*String sql = "INSERT INTO crude_pro (id, name, age) VALUES (?, ?, ?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, 1);
		statement.setString(2, "Surya");
		statement.setInt(3, 19);
		statement.executeUpdate();
		statement.setInt(1, 3);
		statement.setString(2,"Akshaya");
		statement.setInt(3, 20);
		statement.executeUpdate();
		statement.setInt(1, 4);
		statement.setString(2,"Kavya");
		statement.setInt(3, 24);
		statement.executeUpdate();
		
		System.out.println("Record Created");*/

		/*String sql = "Select id, name, age FROM crude_pro WHERE ID = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, 1);
		ResultSet result = statement.executeQuery();
		if(result.next()) {
			System.out.println("name :" + result.getString("name"));
			System.out.println("age :" + result.getInt("age"));
			System.out.println(result.getString("name"));
		}*/
		String sql = "UPDATE crude_pro SET name = ?, age = ? WHERE id = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1,  "AKshayya");
		statement.setString(3,  "Surya");
		statement.setInt(2,  19);
	    statement.setInt(3,  1);
	    statement.executeUpdate();
		System.out.println("Record Updated");
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
		}
}
}