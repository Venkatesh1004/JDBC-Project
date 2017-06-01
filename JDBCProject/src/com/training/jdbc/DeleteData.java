package com.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {
		try {
			DatabaseConnection dbconn = new DatabaseConnection();
			Connection conn = dbconn.getDatabaseConnection();
			/*String SQL = "update new_table set name = 'pash' where id = 1 ";*/
			String SQL = "delete from new_table where age = ?";
			PreparedStatement prstmt = conn.prepareStatement(SQL);	
		
			prstmt.setInt(1, 23);
			prstmt.executeUpdate();
			
					

			
			/*
			 * ResultSet rs= stmt.executeQuery(SQL); while(rs.next()) {
			 * System.out.println(rs.getInt(1));
			 * System.out.println(rs.getString(2));
			 * System.out.println(rs.getString(3));
			 * System.out.println(rs.getString(4)); }
			 */
			conn.close();
			System.out.println(conn.isClosed());
		}

		catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
