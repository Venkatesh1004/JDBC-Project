package com.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOrSelect {
	public static void main(String[] args) {
		try {
			DatabaseConnection dbconn = new DatabaseConnection();
			Connection conn = dbconn.getDatabaseConnection();
			String SQL = "select * from new_table";
			
			Statement stmt = conn.createStatement();
			ResultSet rs= stmt.executeQuery(SQL);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			conn.close();
			System.out.println(conn.isClosed());
		}

		catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
