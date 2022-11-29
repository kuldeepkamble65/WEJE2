package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class First {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/weje2?"+"user=root&password=root");
			
			Statement st = con.createStatement();
			ResultSet resultset = st.executeQuery("select * from student");
			while(resultset.next()) {
				System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
			}
			
			st.close();
			resultset.close();
			con.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	
	}
}
