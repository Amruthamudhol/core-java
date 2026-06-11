package com.xworkz.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db", "root", "4AI22CS005");

            Statement statement = connection.createStatement();

            String sqlQuery = "insert into hotel_booking values(108, 'amruta', 'single', 2500.00)";

            int rowsAffected = statement.executeUpdate(sqlQuery);

            System.out.println("Rows Inserted: " + rowsAffected);

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}