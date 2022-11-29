package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/weje2?"+"user=root&password=root");
		Statement st = con.createStatement();
		
		int result = st.executeUpdate("insert into student values(4,'ronaldo','ronaldo@gmail.com')");
		
		System.out.println(result+"row(5) affected");
		
		con.close();
		st.close();
	
	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
