package com.xworkz.inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_db", "root", "4AI22CS005");
            Statement statement = connection.createStatement();

            String sqlQuery = "insert into inventory_info values(110, 'mouse', 50, 'logitech')";

            int rowsAffected = statement.executeUpdate(sqlQuery);
            System.out.println("Rows Inserted: " + rowsAffected);

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}