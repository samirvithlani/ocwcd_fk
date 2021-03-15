package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String userName = "postgres";
	private static String password = "root";
	private static String connectionURL = "jdbc:postgresql://localhost:5432/7pm";
	private static String driverClass = "org.postgresql.Driver";

	public static Connection getDBConnection() {

		Connection conn = null;

		try {
			Class.forName(driverClass);

			conn = DriverManager.getConnection(connectionURL, userName, password);

			if (conn != null) {

				System.out.println("connected to db..");
			} else {

				System.out.println("connected to db..");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	public static void main(String[] args) {

		DBConnection.getDBConnection();
	}

}
