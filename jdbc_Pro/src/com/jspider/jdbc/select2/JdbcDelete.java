package com.jspider.jdbc.select2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDelete {
	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			FileReader fileReader = new FileReader("D:\\WEJE2\\jdbc_Pro\\Resources\\db_info.properties");
			properties.load(fileReader);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
			statement = connection.createStatement();
			result = statement.executeUpdate("delete from student where id = 4");
			System.out.println(result+"row(s) affected");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
			}if(statement!= null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
