package com.database;

import java.sql.Connection; //Represents a connection/session with the MySQL database.
import java.sql.DriverManager; //Manages JDBC drivers and establishes the connection between Java and MySQL.
import java.sql.Statement; //Used to execute static SQL statements (DDL like CREATE, USE).

public class CreateDatabase {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/"; // NO database here
		String user = "root";
		String password = "Thilak@2004";
		//DriverManager.getConnection(...)
		//Loads the MySQL JDBC driver.
		//Authenticates using username and password.
		//Establishes a connection to MySQL.
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement()) {

			// Create database
			String createDB = "CREATE DATABASE IF NOT EXISTS student";
			stmt.executeUpdate(createDB);
			System.out.println("Database created successfully.");

			// Switch to database
			String useDB = "USE student";
			stmt.executeUpdate(useDB);

			// Create table
			String createTable = "CREATE TABLE IF NOT EXISTS students (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
					+ "name VARCHAR(50), " + "age INT, " + "city VARCHAR(50))";

			stmt.executeUpdate(createTable);
			System.out.println("Table created successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
