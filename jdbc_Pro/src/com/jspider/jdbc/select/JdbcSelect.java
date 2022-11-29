package com.jspider.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class JdbcSelect {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/weje2?"+"user=root&password=root");
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from student");
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" | "+ resultset.getString(2)+ " | "+resultset.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
				connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				try {
				statement.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultset!=null) {
				try {
				resultset.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	
}
