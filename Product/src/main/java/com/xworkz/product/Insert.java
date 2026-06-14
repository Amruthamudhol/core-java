package com.xworkz.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db", "root", "4AI22CS005");
            Statement statement = connection.createStatement();
            String sqlQuery = "INSERT INTO product VALUES (1, 'Laptop', 50000)";
            int rows = statement.executeUpdate(sqlQuery);

            if (rows > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Insert failed");
            }

            // Close Resources
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        }
    }
}