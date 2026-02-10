package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sakila"; 
		String user = "root"; //MySQL user name
		String password = "Thilak@2004"; //MySQL password

		try (Connection con = DriverManager.getConnection(url, user, password)) {
			System.out.println("MySQL connected successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
