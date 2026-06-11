package com.xworkz.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db", "root", "4AI22CS005");
            Statement statement = connection.createStatement();

            String sqlQuery = "update hotel_booking set amount = 5000.00 where booking_id = 101";
            int rowsAffected = statement.executeUpdate(sqlQuery);

            System.out.println("Rows Updated: " + rowsAffected);

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}