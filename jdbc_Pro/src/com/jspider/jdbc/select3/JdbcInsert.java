package com.jspider.jdbc.select3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcInsert {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static int result;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static String filepath = "D:\\WEJE2\\jdbc_Pro\\Resources\\db_info.properties";
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filepath);
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("Driverpath"));
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
			
			String query = "insert into student values(?,?,?)";
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,3);
			preparedStatement.setString(2, "messi");
			preparedStatement.setString(3, "messi123@gmail.com");
			
			result = preparedStatement.executeUpdate();
			System.out.println(result+"row(s) affected");
			
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
			if(connection!= null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(preparedStatement!= null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}			
	