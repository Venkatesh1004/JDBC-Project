package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DatabaseConnection {

	private Connection conn;
	private String driver;
	private String url;
	private String username;
	private String password;

	public Connection getDatabaseConnection() {
		try {
		ResourceBundle rs = ResourceBundle.getBundle("dbParameters");
		driver = rs.getString("DB_DRIVER");
		url = rs.getString("DB_URL");
		username = rs.getString("DB_USER");
		password = rs.getString("DB_PASSWORD");
		

			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	
	
		   return conn;
	}
}

