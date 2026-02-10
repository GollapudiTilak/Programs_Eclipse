package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcMySQL {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/student"; // database URL
		String user = "root"; // MySQL user
		String password = "Thilak@2004"; // MySQL password

		try (Connection con = DriverManager.getConnection(url, user, password)) {

			// Insert sample data
			String insertSQL = "INSERT INTO students (name, age, city) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);

			pstmt.setString(1, "Nava Bharath");
			pstmt.setInt(2, 23);
			pstmt.setString(3, "Hyderabad");
			pstmt.executeUpdate();

			pstmt.setString(1, "Shashank sai");
			pstmt.setInt(2, 22);
			pstmt.setString(3, "Hyderabad");
			pstmt.executeUpdate();

			System.out.println("Data inserted successfully!");

			// Display all students
			String selectSQL = "SELECT * FROM students";
			ResultSet rs = con.createStatement().executeQuery(selectSQL);

			System.out.println("ID\tName\tAge\tCity");
			System.out.println("-------------------------------");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String city = rs.getString("city");

				System.out.println(id + "\t" + name + "\t" + age + "\t" + city);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
