package com.project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc{

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:1308/student";
        String user = "postgres";
        String password = "Thilak@2004";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM students";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\tAge\tCity");
            System.out.println("-------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String city = rs.getString("city");

                System.out.println(id + "\t" + name + "\t" + age + "\t" + city);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
