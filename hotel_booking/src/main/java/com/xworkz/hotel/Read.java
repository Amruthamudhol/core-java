package com.xworkz.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sqlQuery = "select * from hotel_booking";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db", "root", "4AI22CS005");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.println("Booking ID : " + resultSet.getInt("booking_id"));
                System.out.println("Customer Name : " + resultSet.getString("customer_name"));
                System.out.println("Room Type : " + resultSet.getString("room_type"));
                System.out.println("Amount : " + resultSet.getDouble("amount"));
                System.out.println("----------");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (resultSet != null)
                    resultSet.close();

                if (statement != null)
                    statement.close();

                if (connection != null)
                    connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}