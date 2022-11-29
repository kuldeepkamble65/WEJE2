package com.jspider.jdbc.select3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;

public class JdbcSelect {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultset;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static String filepath =  "D:\\WEJE2\\jdbc_Pro\\Resources\\db_info.properties";
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filepath);
			properties.load(fileReader);
		
			Class.forName(properties.getProperty("Driverpath"));
			  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
			  
			 String query = "select * form student";
			 
			 preparedStatement = connection.prepareStatement(query);
			 
			// preparedStatement.setInt(1, 3);
			// preparedStatement.setString(2, "neymar");
			// preparedStatement.setString(3, "neymar123@gmail.com");
			
			 resultset = preparedStatement.executeQuery();
			 while(resultset.next()) {
				 System.out.println(resultset.getInt(1)+" | " +resultset.getString(2)+" | "+ resultset.getString(3));
			 }
			 
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(resultset != null) {
				try {
					resultset.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		
	}
}
